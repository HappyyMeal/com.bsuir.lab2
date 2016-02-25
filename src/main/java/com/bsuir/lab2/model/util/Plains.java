package com.bsuir.lab2.model.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bsuir.lab2.model.impl.Plain;
@XmlRootElement(name = "plains")
@XmlAccessorType (XmlAccessType.FIELD)
public class Plains {
	@XmlElement(name = "plain")
	private List<Plain> plains = new ArrayList<Plain>();

	public List<Plain> getPlains() {
		return plains;
	}

	public void setPlains(List<Plain> plains) {
		this.plains = plains;
	}
}
