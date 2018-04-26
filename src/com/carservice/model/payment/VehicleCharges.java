package com.carservice.model.payment;

import com.carservice.ltd.model.vehicle.CarType;

public class VehicleCharges {
	
	private int vehiclechargesid;
	private CarType cartype;
	private double day_charge;
	private double night_charge;
	private double for_day_booking;
	private double for_night_booking;
	private double weekly_rate;
	private double monthly_rate;
	private double extraperkm;
	private double waitingcharges;//per_min
	public VehicleCharges() {}
	public VehicleCharges(int vehiclechargesid, CarType cartype, double day_charge, double night_charge,
			double for_day_booking, double for_night_booking, double weekly_rate, double monthly_rate,
			double extraperkm, double waitingcharges) {
		super();
		this.vehiclechargesid = vehiclechargesid;
		this.cartype = cartype;
		this.day_charge = day_charge;
		this.night_charge = night_charge;
		this.for_day_booking = for_day_booking;
		this.for_night_booking = for_night_booking;
		this.weekly_rate = weekly_rate;
		this.monthly_rate = monthly_rate;
		this.extraperkm = extraperkm;
		this.waitingcharges = waitingcharges;
	}
	public int getVehiclechargesid() {
		return vehiclechargesid;
	}
	public void setVehiclechargesid(int vehiclechargesid) {
		this.vehiclechargesid = vehiclechargesid;
	}
	public CarType getCartype() {
		return cartype;
	}
	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}
	public double getDay_charge() {
		return day_charge;
	}
	public void setDay_charge(double day_charge) {
		this.day_charge = day_charge;
	}
	public double getNight_charge() {
		return night_charge;
	}
	public void setNight_charge(double night_charge) {
		this.night_charge = night_charge;
	}
	public double getFor_day_booking() {
		return for_day_booking;
	}
	public void setFor_day_booking(double for_day_booking) {
		this.for_day_booking = for_day_booking;
	}
	public double getFor_night_booking() {
		return for_night_booking;
	}
	public void setFor_night_booking(double for_night_booking) {
		this.for_night_booking = for_night_booking;
	}
	public double getWeekly_rate() {
		return weekly_rate;
	}
	public void setWeekly_rate(double weekly_rate) {
		this.weekly_rate = weekly_rate;
	}
	public double getMonthly_rate() {
		return monthly_rate;
	}
	public void setMonthly_rate(double monthly_rate) {
		this.monthly_rate = monthly_rate;
	}
	public double getExtraperkm() {
		return extraperkm;
	}
	public void setExtraperkm(double extraperkm) {
		this.extraperkm = extraperkm;
	}
	public double getWaitingcharges() {
		return waitingcharges;
	}
	public void setWaitingcharges(double waitingcharges) {
		this.waitingcharges = waitingcharges;
	}
	
}
