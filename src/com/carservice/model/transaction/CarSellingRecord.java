package com.carservice.model.transaction;

import java.util.Date;

import com.carservice.ltd.model.User;
import com.carservice.model.payment.Payment;

public class CarSellingRecord {
	private int carsellingid;
	private User user;
	private Payment payment;
    private Date dateofsale;
    private CarForSale carforsale;
    
    public CarSellingRecord() {}
    
    
	public CarSellingRecord(int carsellingid, User user, Payment payment, Date dateofsale, CarForSale carforsale) {
		super();
		this.carsellingid = carsellingid;
		this.user = user;
		this.payment = payment;
		this.dateofsale = dateofsale;
		this.carforsale = carforsale;
	}


	public int getCarsellingid() {
		return carsellingid;
	}
	public void setCarsellingid(int carsellingid) {
		this.carsellingid = carsellingid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSale getCarforsale() {
		return carforsale;
	}
	public void setCarforsale(CarForSale carforsale) {
		this.carforsale = carforsale;
	}
    
    
}
