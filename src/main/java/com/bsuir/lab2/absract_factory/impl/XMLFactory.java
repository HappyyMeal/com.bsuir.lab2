package com.bsuir.lab2.absract_factory.impl;

import java.util.List;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;

public class XMLFactory implements AbstractFactory {

	private static final String XML_SOURCE = "src/main/resources/source.xml";

	public List<Transport> create() {
		// take a look at the jaxb or xStream
		
		return null;
	}

}
