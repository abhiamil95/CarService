package com.carservice.model.transaction;

import java.util.Date;

import com.carservice.ltd.model.User;
import com.carservice.ltd.model.places.Location;
import com.carservice.ltd.model.vehicle.Car;

public class BookingRecord {

	private int bookingid;
	private Location source;
	private Location destination;
	private User user;
	private Car car;
	private Timesheet timesheet;
	private Date doj;
	private int distance;
	private int count_of_passegers;
	private byte driver_flag;
	private byte confirmation_flag;
	
	public BookingRecord() {}
	public BookingRecord(int bookingid, Location source, Location destination, User user, Car car, Timesheet timesheet,
			Date doj, int distance, int count_of_passegers, byte driver_flag, byte confirmation_flag) {
		super();
		this.bookingid = bookingid;
		this.source = source;
		this.destination = destination;
		this.user = user;
		this.car = car;
		this.timesheet = timesheet;
		this.doj = doj;
		this.distance = distance;
		this.count_of_passegers = count_of_passegers;
		this.driver_flag = driver_flag;
		this.confirmation_flag = confirmation_flag;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Location getSource() {
		return source;
	}
	public void setSource(Location source) {
		this.source = source;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Timesheet getTimesheet() {
		return timesheet;
	}
	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getCount_of_passegers() {
		return count_of_passegers;
	}
	public void setCount_of_passegers(int count_of_passegers) {
		this.count_of_passegers = count_of_passegers;
	}
	public byte getDriver_flag() {
		return driver_flag;
	}
	public void setDriver_flag(byte driver_flag) {
		this.driver_flag = driver_flag;
	}
	public byte getConfirmation_flag() {
		return confirmation_flag;
	}
	public void setConfirmation_flag(byte confirmation_flag) {
		this.confirmation_flag = confirmation_flag;
	}
	
	
	
}
