package com.carservice.model.transaction;

import com.carservice.model.payment.Payment;

public class Confirmation {

	private int confrimationid;
	private BookingRecord bookingrecord;
	private Payment payment;
	private byte confrimationflag;
	/*1 for confirm, 2 for cancle
	 * 3 for return
	 */
	private Confirmation() {}
	public Confirmation(int confrimationid, BookingRecord bookingrecord, Payment payment, byte confrimationflag) {
		super();
		this.confrimationid = confrimationid;
		this.bookingrecord = bookingrecord;
		this.payment = payment;
		this.confrimationflag = confrimationflag;
	}
	public int getConfrimationid() {
		return confrimationid;
	}
	public void setConfrimationid(int confrimationid) {
		this.confrimationid = confrimationid;
	}
	public BookingRecord getBookingrecord() {
		return bookingrecord;
	}
	public void setBookingrecord(BookingRecord bookingrecord) {
		this.bookingrecord = bookingrecord;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public byte getConfrimationflag() {
		return confrimationflag;
	}
	public void setConfrimationflag(byte confrimationflag) {
		this.confrimationflag = confrimationflag;
	}
	
}
