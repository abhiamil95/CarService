package com.carservice.model.payment;

import java.util.Date;

import com.carservice.ltd.model.vehicle.Car;

public class Insurance {

private int insuranceid;
private Car car;
private Date date_of_renewal;
private double amount;
private String companyname;
private int version;
private InsuranceType insurancetype;
public  Insurance() {}

public Insurance(int insuranceid, Car car, Date date_of_renewal, double amount, String companyname, int version,
		InsuranceType insurancetype) {
	super();
	this.insuranceid = insuranceid;
	this.car = car;
	this.date_of_renewal = date_of_renewal;
	this.amount = amount;
	this.companyname = companyname;
	this.version = version;
	this.insurancetype = insurancetype;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public int getInsuranceid() {
	return insuranceid;
}
public void setInsuranceid(int insuranceid) {
	this.insuranceid = insuranceid;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Date getDate_of_renewal() {
	return date_of_renewal;
}
public void setDate_of_renewal(Date date_of_renewal) {
	this.date_of_renewal = date_of_renewal;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public InsuranceType getInsurancetype() {
	return insurancetype;
}
public void setInsurancetype(InsuranceType insurancetype) {
	this.insurancetype = insurancetype;
}



}
