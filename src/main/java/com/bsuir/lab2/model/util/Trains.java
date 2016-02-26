package com.bsuir.lab2.model.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bsuir.lab2.model.impl.Train;
@XmlRootElement(name = "trains")
@XmlAccessorType (XmlAccessType.FIELD)
public class Trains {
	@XmlElement(name = "train")
	private List<Train> trains = new ArrayList<Train>();

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
}
