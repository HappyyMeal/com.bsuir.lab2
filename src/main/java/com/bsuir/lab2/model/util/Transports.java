package com.bsuir.lab2.model.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;

@XmlRootElement(name = "transports")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlSeeAlso({Transport.class})
public class Transports {
	
	@XmlElementRef
	private Buses allBuses;
	
	@XmlElementRef
	private Trains allTrains;
	
	@XmlElementRef
	private Plains allPlains;

	public Trains getAllTrains() {
		return allTrains;
	}

	public void setAllTrains(Trains allTrains) {
		this.allTrains = allTrains;
	}

	public Plains getAllPlains() {
		return allPlains;
	}

	public void setAllPlains(Plains allPlains) {
		this.allPlains = allPlains;
	}

	public Buses getAllBuses() {
		return allBuses;
	}

	public void setAllBuses(Buses allBuses) {
		this.allBuses = allBuses;
	}
	
}
