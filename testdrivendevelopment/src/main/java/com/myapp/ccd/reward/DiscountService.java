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

	public double calculateTotal(List<Product> list) {
		double sum = 0;
		if (list != null) {
			list.stream().mapToDouble(Product::getPrice).sum();

		}

		return sum;
	}

	@Override
	public RewardInformation applyReward(List<Product> order, long customerPoints) {
		// TODO Auto-generated method stub
		
		RewardInformation rewardInfo = new RewardInformation();
		double ordertotal;
		if(customerPoints>=requiredPoints) {
			ordertotal=calculateTotal(order);
			double discount=ordertotal*percentage;
			rewardInfo.setDiscount(discount);
		}
		
		return  rewardInfo;
	}

}
