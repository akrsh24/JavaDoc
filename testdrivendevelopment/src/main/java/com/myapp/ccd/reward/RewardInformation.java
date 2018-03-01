package com.myapp.ccd.reward;

public class RewardInformation {

	private long pointsRedeemed;
	private double discount;

	public long getPointsRedeemed() {
		return pointsRedeemed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public RewardInformation(long pointsRedeemed, double discount) {
		super();
		this.pointsRedeemed = pointsRedeemed;
		this.discount = discount;
	}

	public void setPointsRedeemed(long pointsRedeemed) {
		this.pointsRedeemed = pointsRedeemed;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public RewardInformation() {
		// TODO Auto-generated constructor stub
	}

}
