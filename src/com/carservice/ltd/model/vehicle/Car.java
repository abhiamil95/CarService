package com.carservice.ltd.model.vehicle;

import java.util.Date;

import com.carservice.ltd.model.places.Branch;
import com.carservice.model.payment.VehicleCharges;

public class Car {

	private int carid;
	private String carname;
	private String regi_number;
	private String vehicleno;
	private Date dateadded;
	private Date modelyr;
	private CarType cartype;
	private FuelType fueltype;
	private byte available_flag;
	private Branch branch;
	public Car() {}

	

	public Car(int carid, String carname, String regi_number, String vehicleno, Date dateadded, Date modelyr,
			CarType cartype, FuelType fueltype, byte available_flag, Branch branch) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.regi_number = regi_number;
		this.vehicleno = vehicleno;
		this.dateadded = dateadded;
		this.modelyr = modelyr;
		this.cartype = cartype;
		this.fueltype = fueltype;
		this.available_flag = available_flag;
		this.branch = branch;
	}

   

	public Branch getBranch() {
		return branch;
	}



	public void setBranch(Branch branch) {
		this.branch = branch;
	}



	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getRegi_number() {
		return regi_number;
	}

	public void setRegi_number(String regi_number) {
		this.regi_number = regi_number;
	}

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public Date getDateadded() {
		return dateadded;
	}

	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}

	public Date getModelyr() {
		return modelyr;
	}

	public void setModelyr(Date modelyr) {
		this.modelyr = modelyr;
	}

	public CarType getCartype() {
		return cartype;
	}

	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}

	public FuelType getFueltype() {
		return fueltype;
	}

	public void setFueltype(FuelType fueltype) {
		this.fueltype = fueltype;
	}

	public byte getAvailable_flag() {
		return available_flag;
	}

	public void setAvailable_flag(byte available_flag) {
		this.available_flag = available_flag;
	}

	
}
