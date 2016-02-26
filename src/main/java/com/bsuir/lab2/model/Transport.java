package com.bsuir.lab2.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public abstract class Transport {

	private int id;
	private Date departureDate;
	private Date departureTime;
	private String departureStation;
	private String departurePlatform;

	private String arrivalPlace;
	private String arrivalStation;
	private Date arrivalDate;
	private Date arrivalTime;
	private double fare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public String getDeparturePlatform() {
		return departurePlatform;
	}

	public void setDeparturePlatform(String departurePlatform) {
		this.departurePlatform = departurePlatform;
	}

	public String getArrivalPlace() {
		return arrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Transport{" +
				"id=" + id +
				", departureDate=" + departureDate +
				", departureTime=" + departureTime +
				", departureStation='" + departureStation + '\'' +
				", departurePlatform='" + departurePlatform + '\'' +
				", arrivalPlace='" + arrivalPlace + '\'' +
				", arrivalStation='" + arrivalStation + '\'' +
				", arrivalDate=" + arrivalDate +
				", arrivalTime=" + arrivalTime +
				", fare=" + fare +
				'}';
	}
}