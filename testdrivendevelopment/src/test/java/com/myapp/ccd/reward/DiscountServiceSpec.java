package com.myapp.ccd.reward;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.myapp.ccd.model.Product;

public class DiscountServiceSpec {

	private DiscountService reward;

	@BeforeEach
	@DisplayName("Given 100 points are needed for $10")
	private void setUp() {
		reward = new DiscountService();
		reward.setPercentage(0.1);
		reward.setRequiredPoints(100);
	}

	@AfterEach
	private void tearDown() {
		reward = null;
	}

	@Test
	private void setPercentageForPoint() {
		reward.setPercentage(0.4);
		assertEquals(0.4, reward.getPercentage());

	}

	@Test
	@DisplayName("The 100 points should be needed for 10% discount")
	void checkPercentageAndRequiredPoints() {
		assertEquals(0.1, reward.getPercentage());
		assertEquals(100, reward.getRequiredPoints());

	}

	@Test
	private void setRequiredPoints() {
		reward.setRequiredPoints(200);

		assertEquals(200, reward.getRequiredPoints());

	}

	@Test
	void zeroCustomerPoints() {
		Product product = new Product(1, "Capuccino", 4.5);
		List<Product> list = Collections.singletonList(product);

		RewardInformation rewardInfo = reward.applyReward(list, 0);
		assertEquals(0, rewardInfo.getDiscount());

	}

	@DisplayName("Given there's a small order")
	@Nested
	class SmallOrder {
		private List<Product> smallOrder = null;

		@BeforeEach
		void setUp() {
			Product smallDecaf = new Product(1, "Small Decaf", 1.99);
			smallOrder = Collections.singletonList(smallDecaf);
		}

		@Nested
		@DisplayName("Given the customer has zero points")
		class ZeroPoints {
			private RewardInformation info = null;

			@BeforeEach
			@DisplayName("When the reward is applied")
			void setUp() {
				info = reward.applyReward(smallOrder, 0);
			}

			@Test
			@DisplayName("Then discount should be zero")
			void checkDiscount() {
				assertEquals(0, info.getDiscount());
			}

			@Test
			@DisplayName("Then points redeemed should be zero")
			void checkPointsRedeemed() {
				assertEquals(0, info.getPointsRedeemed());
			}
		}
	}

}
