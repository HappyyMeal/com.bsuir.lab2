package com.bsuir.lab2.absract_factory.impl;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;
import com.bsuir.lab2.model.util.Buses;
import com.bsuir.lab2.model.util.Plains;
import com.bsuir.lab2.model.util.Trains;
import com.bsuir.lab2.model.util.Transports;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class XMLFactory implements AbstractFactory {

    private static final String XML_SOURCE = "src/main/resources/source.xml";
    
    public List<Transport> create() {
    	List<Transport> allTransport = new ArrayList<Transport>();
    	
    	try {
	    	File file = new File(XML_SOURCE);
	        JAXBContext jaxbContext = JAXBContext.newInstance(Transports.class);
	        Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Transports transports  = (Transports) jaxbUnmarshaller.unmarshal(file);
		
			allTransport.addAll(transports.getAllBuses().getBuses());
			allTransport.addAll(transports.getAllTrains().getTrains());
			allTransport.addAll(transports.getAllPlains().getPlains());
		} catch (JAXBException e) {
			System.out.println("Exception caught during reading data from xml!!!");
			e.printStackTrace();
		}
		return allTransport;
    }

}
