package com.bsuir.lab2.model.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
@XmlRootElement(name = "buses")
@XmlAccessorType (XmlAccessType.FIELD)
public class Buses {
	
	@XmlElement(name = "bus")
	private List<Bus> buses = new ArrayList<Bus>();

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}
	
	
}
