package com.carservice.model.payment;

public class DriverCharges {

	private int driverchargeid;
	private double charges_for_day;
	private double charges_for_night;
	private double day_charges;
	private double night_charges;
	private double monthly_rate;
	private double weekly_rate;
	private double waiting_rate;
	public DriverCharges() {}
	public DriverCharges(int driverchargeid, double charges_for_day, double charges_for_night, double day_charges,
			double night_charges, double monthly_rate, double weekly_rate, double waiting_rate) {
		super();
		this.driverchargeid = driverchargeid;
		this.charges_for_day = charges_for_day;
		this.charges_for_night = charges_for_night;
		this.day_charges = day_charges;
		this.night_charges = night_charges;
		this.monthly_rate = monthly_rate;
		this.weekly_rate = weekly_rate;
		this.waiting_rate = waiting_rate;
	}
	public int getDriverchargeid() {
		return driverchargeid;
	}
	public void setDriverchargeid(int driverchargeid) {
		this.driverchargeid = driverchargeid;
	}
	public double getCharges_for_day() {
		return charges_for_day;
	}
	public void setCharges_for_day(double charges_for_day) {
		this.charges_for_day = charges_for_day;
	}
	public double getCharges_for_night() {
		return charges_for_night;
	}
	public void setCharges_for_night(double charges_for_night) {
		this.charges_for_night = charges_for_night;
	}
	public double getDay_charges() {
		return day_charges;
	}
	public void setDay_charges(double day_charges) {
		this.day_charges = day_charges;
	}
	public double getNight_charges() {
		return night_charges;
	}
	public void setNight_charges(double night_charges) {
		this.night_charges = night_charges;
	}
	public double getMonthly_rate() {
		return monthly_rate;
	}
	public void setMonthly_rate(double monthly_rate) {
		this.monthly_rate = monthly_rate;
	}
	public double getWeekly_rate() {
		return weekly_rate;
	}
	public void setWeekly_rate(double weekly_rate) {
		this.weekly_rate = weekly_rate;
	}
	public double getWaiting_rate() {
		return waiting_rate;
	}
	public void setWaiting_rate(double waiting_rate) {
		this.waiting_rate = waiting_rate;
	}

	
	
}
