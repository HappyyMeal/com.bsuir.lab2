package com.bsuir.lab2.filter;

public class FilterEntry {

	private String from;
	private String to;
	private String departurePlace;
	private String arrivalPlace;
	private Integer nearlestTransportCount;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDeparturePlace() {
		return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public String getArrivalPlace() {
		return arrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	public Integer getNearlestTransportCount() {
		return nearlestTransportCount;
	}

	public void setNearlestTransportCount(Integer nearlestTransportCount) {
		this.nearlestTransportCount = nearlestTransportCount;
	}

	@Override
	public String toString() {
		return "FilterEntry [from=" + from + ", to=" + to + ", departurePlace=" + departurePlace + ", arrivalPlace="
				+ arrivalPlace + ", nearlestTransportCount=" + nearlestTransportCount + "]";
	}

}
