package com.carservice.model.payment;

import java.util.Date;

public class DemadDraft {

	private String ddno;
	private String bankname;
	private String branchname;
	private double amount;
	private Date ddtime;
	private Date dddate;
	private Date expdate;
	private Payment payment;
	public DemadDraft()
	{
	}
	public DemadDraft(String ddno, String bankname, String branchname, double amount, Date ddtime, Date dddate,
			Date expdate, Payment payment) {
		super();
		this.ddno = ddno;
		this.bankname = bankname;
		this.branchname = branchname;
		this.amount = amount;
		this.ddtime = ddtime;
		this.dddate = dddate;
		this.expdate = expdate;
		this.payment = payment;
	}
	public String getDdno() {
		return ddno;
	}
	public void setDdno(String ddno) {
		this.ddno = ddno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDdtime() {
		return ddtime;
	}
	public void setDdtime(Date ddtime) {
		this.ddtime = ddtime;
	}
	public Date getDddate() {
		return dddate;
	}
	public void setDddate(Date dddate) {
		this.dddate = dddate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
