package com.carservice.ltd.model.places;

public class Branch {

	private int branchid;
	private String name;
	private String contact;
	private String branchemail;
	public Branch() {}
	public Branch(int branchid, String name, String contact, String branchemail) {
		super();
		this.branchid = branchid;
		this.name = name;
		this.contact = contact;
		this.branchemail = branchemail;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBranchemail() {
		return branchemail;
	}
	public void setBranchemail(String branchemail) {
		this.branchemail = branchemail;
	}
	
}
