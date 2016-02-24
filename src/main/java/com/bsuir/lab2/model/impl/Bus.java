package com.bsuir.lab2.model.impl;

import com.bsuir.lab2.model.Transport;

public class Bus extends Transport {

	private String mark;
	private int journeyTime;

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(int journeyTime) {
		this.journeyTime = journeyTime;
	}
}
