package com.bsuir.lab2.model.impl;

import com.bsuir.lab2.model.Transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Bus extends Transport {
		
	public Bus(){}
	
	public Bus(String mark, int journeyTime) {
		super();
		this.mark = mark;
		this.journeyTime = journeyTime;
	}

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

	@Override
	public String toString() {
		return super.toString() + "Bus{" +
				"mark='" + mark + '\'' +
				", journeyTime=" + journeyTime +
				'}';
	}
}
