package com.bsuir.lab2.model;

import java.util.Date;

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

}
/*
 * јвтобус: вокзал прибыти€, стоимость билетов, марка автобуса , врем€ в пути.
 * 
 * ѕоезд: вокзал прибыти€, типы и стоимость билетов, дата прибыти€ , врем€
 * прибыти€.
 * 
 * —амолет: рассто€ние аэропорта вылета от центра города, дата прилета, врем€
 * прилета, количество пересадок, типы и стоимость билетов, авиакомпани€,
 * максимальный вес багажа, максимальный вес ручной клади, врем€ (интервал)
 * окончани€ регистрации.
 * 
 */