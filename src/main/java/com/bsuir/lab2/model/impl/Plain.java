package com.bsuir.lab2.model.impl;

import com.bsuir.lab2.model.Transport;

public class Plain extends Transport {

	private int connectionNumber;
	private String companyName;
	private double baggageAllowance;
	private double carryOnBaggageAllowance;

	public int getConnectionNumber() {
		return connectionNumber;
	}

	public void setConnectionNumber(int connectionNumber) {
		this.connectionNumber = connectionNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getBaggageAllowance() {
		return baggageAllowance;
	}

	public void setBaggageAllowance(double baggageAllowance) {
		this.baggageAllowance = baggageAllowance;
	}

	public double getCarryOnBaggageAllowance() {
		return carryOnBaggageAllowance;
	}

	public void setCarryOnBaggageAllowance(double carryOnBaggageAllowance) {
		this.carryOnBaggageAllowance = carryOnBaggageAllowance;
	}

}
