package com.carservice.model.payment;

import java.util.Date;

public class Coupon {

	private int couponid;
	private double discount;
	private double min_amount;
	private double max_amount;
	private Date expdate;
	public Coupon() {}
	public Coupon(int couponid, double discount, double min_amount, double max_amount, Date expdate) {
		super();
		this.couponid = couponid;
		this.discount = discount;
		this.min_amount = min_amount;
		this.max_amount = max_amount;
		this.expdate = expdate;
	}
	public int getCouponid() {
		return couponid;
	}
	public void setCouponid(int couponid) {
		this.couponid = couponid;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getMin_amount() {
		return min_amount;
	}
	public void setMin_amount(double min_amount) {
		this.min_amount = min_amount;
	}
	public double getMax_amount() {
		return max_amount;
	}
	public void setMax_amount(double max_amount) {
		this.max_amount = max_amount;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	
	
}
