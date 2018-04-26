package com.carservice.ltd.model;

public class Address {
	
	private String emailid;
	private String mobile;
	private String street;
	private String city;
	private String pin;
	private String state;
	private String country;
	
	public Address() {}
	
	public Address(String emailid, String mobile, String street, String city, String pin, String state,
			String country) {
		super();
		this.emailid = emailid;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}
