package com.myapp.ccd.reward;

import java.util.List;

import com.myapp.ccd.model.Product;

public class DiscountService extends RewardService {

	private double percentage;
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public RewardInformation applyReward(List<Product> order, long customerPoints) {
		// TODO Auto-generated method stub
		return null;
	}

}
