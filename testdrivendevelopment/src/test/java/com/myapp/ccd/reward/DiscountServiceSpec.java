package com.myapp.ccd.reward;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.myapp.ccd.reward.DiscountService;

public class DiscountServiceSpec {

	private DiscountService reward;

	@BeforeEach
	private void setUp() {
		reward = new DiscountService();
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
	private void setRequiredPoints() {
		reward.setRequiredPoints(200);
		
		assertEquals(100, reward.getRequiredPoints());

	}


}
