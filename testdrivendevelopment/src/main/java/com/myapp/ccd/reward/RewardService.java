package com.myapp.ccd.reward;

import java.util.List;

import com.myapp.ccd.model.Product;

public abstract class RewardService {
	
	protected long requiredPoints;
	
	public abstract RewardInformation applyReward(List<Product> order, long customerPoints);

	public long getRequiredPoints() {
		return requiredPoints;
	}

	public void setRequiredPoints(long requiredPoints) {
		this.requiredPoints = requiredPoints;
	}
	
	
	

}
