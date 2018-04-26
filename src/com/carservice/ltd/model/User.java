package com.carservice.ltd.model;

import java.util.Date;
import java.util.Set;

public class User {

	private int userid;
	private String username;
	private String password;
	private Date dob;
	private String Gender;
	private Set<Address> address;
	
	public User() {}
	
	
	public User(int userid, String username, String password, Date dob, String gender, Set<Address> address) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.dob = dob;
		Gender = gender;
		this.address = address;
	}


	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	
}
