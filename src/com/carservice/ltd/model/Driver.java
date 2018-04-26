package com.carservice.ltd.model;

import java.util.Date;
import java.util.Set;

import com.carservice.ltd.model.places.Branch;

public class Driver extends Employee {
	
	private String licence;

	public Driver() {}

	public Driver(int userid, String username, String password, Date dob, String gender, Set<Address> address,
			Date joindate, String role, Branch branch, String licence) {
		super(userid, username, password, dob, gender, address, joindate, role, branch);
		this.licence = licence;
	}



	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

}
