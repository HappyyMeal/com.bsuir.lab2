package com.bsuir.lab2.absract_factory.impl;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;
import com.bsuir.lab2.model.util.Buses;
import com.bsuir.lab2.model.util.Plains;
import com.bsuir.lab2.model.util.Trains;

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

    private static final String BUS_SOURCE = "src/main/resources/xml/bus.xml";
    private static final String TRAIN_SOURCE = "src/main/resources/xml/train.xml";
    private static final String PLAIN_SOURCE = "src/main/resources/xml/plain.xml";
    
    public List<Transport> create() {
    	List<Transport> allTransport = new ArrayList<Transport>();
    	
    	allTransport.addAll(createBuses());
    	allTransport.addAll(createTrains());
    	allTransport.addAll(createPlains());
    	
		return allTransport;
    }
    
    
    private List<Bus> createBuses(){
    	List<Bus> allBuses = new ArrayList<Bus>();
    	
    	try {
	    	File file = new File(BUS_SOURCE);
	        JAXBContext jaxbContext = JAXBContext.newInstance(Buses.class);
	        Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Buses buses  = (Buses) jaxbUnmarshaller.unmarshal(file);
		
			allBuses.addAll(buses.getBuses());
		} catch (JAXBException e) {
			System.out.println("Exception caught during reading data from xml!!!");
			e.printStackTrace();
		}
		return allBuses;
    }

    private List<Train> createTrains(){
    	List<Train> allTrains = new ArrayList<Train>();
    	
    	try {
	    	File file = new File(TRAIN_SOURCE);
	        JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
	        Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Trains trains  = (Trains) jaxbUnmarshaller.unmarshal(file);
		
			allTrains.addAll(trains.getTrains());
		} catch (JAXBException e) {
			System.out.println("Exception caught during reading data from xml!!!");
			e.printStackTrace();
		}
		return allTrains;
    }
    
    private List<Plain> createPlains(){
    	List<Plain> allPlains = new ArrayList<Plain>();
    	
    	try {
	    	File file = new File(PLAIN_SOURCE);
	        JAXBContext jaxbContext = JAXBContext.newInstance(Plains.class);
	        Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Plains plains  = (Plains) jaxbUnmarshaller.unmarshal(file);
		
			allPlains.addAll(plains.getPlains());
		} catch (JAXBException e) {
			System.out.println("Exception caught during reading data from xml!!!");
			e.printStackTrace();
		}
		return allPlains;
    }

}
