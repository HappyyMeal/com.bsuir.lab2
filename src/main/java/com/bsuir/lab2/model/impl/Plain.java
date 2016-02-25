package com.bsuir.lab2.model.impl;

import com.bsuir.lab2.model.Transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Plain extends Transport {

	private int connectionNumber;
	private String companyName;
	private double baggageAllowance;
	private double carryOnBaggageAllowance;

	public Plain(){}
	
	public Plain(int connectionNumber, String companyName,
			double baggageAllowance, double carryOnBaggageAllowance) {
		super();
		this.connectionNumber = connectionNumber;
		this.companyName = companyName;
		this.baggageAllowance = baggageAllowance;
		this.carryOnBaggageAllowance = carryOnBaggageAllowance;
	}

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
