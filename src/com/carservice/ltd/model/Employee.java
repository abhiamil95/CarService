package com.carservice.ltd.model;

import java.util.Date;
import java.util.Set;

import com.carservice.ltd.model.places.Branch;

public class Employee extends User {

	private Date joindate;
	private String role;
	private Branch branch;
	
	public Employee(){}

	public Employee(int userid, String username, String password, Date dob, String gender, Set<Address> address,
			Date joindate, String role, Branch branch) {
		super(userid, username, password, dob, gender, address);
		this.joindate = joindate;
		this.role = role;
		this.branch = branch;
	}





	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
