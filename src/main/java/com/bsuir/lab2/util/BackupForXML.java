package com.bsuir.lab2.util;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;
import com.bsuir.lab2.model.util.Buses;
import com.bsuir.lab2.model.util.Plains;
import com.bsuir.lab2.model.util.Trains;
import com.bsuir.lab2.model.util.Transports;

public class BackupForXML {
	
	private static final String XML_SOURCE = "src/main/resources/source.xml";
	
	public static void main(String[] args) {
	    	
	    	Transports transports = new Transports();
	
	    	Bus bus1 = new Bus();
	        bus1.setId(1);
	        bus1.setDepartureDate(new Date());
	        bus1.setDepartureTime(new Date());
	        bus1.setDepartureStation("Moscow");
	        bus1.setDeparturePlatform("Third");
	        bus1.setArrivalPlace("New York");
	        bus1.setArrivalStation("Fifth");
	        bus1.setArrivalDate(new Date());
	        bus1.setArrivalTime(new Date());
	        bus1.setFare(1000000);
	
	        bus1.setMark("Bentley");
	        bus1.setJourneyTime(50);
	        
	        Bus bus2 = new Bus();
	        bus2.setId(2);
	        bus2.setDepartureDate(new Date());
	        bus2.setDepartureTime(new Date());
	        bus2.setDepartureStation("Malinauka");
	        bus2.setDeparturePlatform("First");
	        bus2.setArrivalPlace("Baranavichi");
	        bus2.setArrivalStation("Second");
	        bus2.setArrivalDate(new Date());
	        bus2.setArrivalTime(new Date());
	        bus2.setFare(50000);
	
	        bus2.setMark("BMW");
	        bus2.setJourneyTime(5);
	        
	        Bus bus3 = new Bus();
	        bus3.setId(3);
	        bus3.setDepartureDate(new Date());
	        bus3.setDepartureTime(new Date());
	        bus3.setDepartureStation("HongKong");
	        bus3.setDeparturePlatform("First");
	        bus3.setArrivalPlace("Warsaw");
	        bus3.setArrivalStation("Second");
	        bus3.setArrivalDate(new Date());
	        bus3.setArrivalTime(new Date());
	        bus3.setFare(80000);
	
	        bus3.setMark("AUDI");
	        bus3.setJourneyTime(19);
	
	        Train train1 = new Train();
	        train1.setId(1);
	        train1.setDepartureDate(new Date());
	        train1.setDepartureTime(new Date());
	        train1.setDepartureStation("Minsk");
	        train1.setDeparturePlatform("First");
	        train1.setArrivalPlace("Mogilev");
	        train1.setArrivalStation("Second");
	        train1.setArrivalDate(new Date());
	        train1.setArrivalTime(new Date());
	        train1.setFare(45000);
	        
	        Train train2 = new Train();
	        train2.setId(2);
	        train2.setDepartureDate(new Date());
	        train2.setDepartureTime(new Date());
	        train2.setDepartureStation("Grodno");
	        train2.setDeparturePlatform("First");
	        train2.setArrivalPlace("Brest");
	        train2.setArrivalStation("Second");
	        train2.setArrivalDate(new Date());
	        train2.setArrivalTime(new Date());
	        train2.setFare(10000);
	        
	        Train train3 = new Train();
	        train3.setId(3);
	        train3.setDepartureDate(new Date());
	        train3.setDepartureTime(new Date());
	        train3.setDepartureStation("Vitebsk");
	        train3.setDeparturePlatform("First");
	        train3.setArrivalPlace("Gomel");
	        train3.setArrivalStation("Second");
	        train3.setArrivalDate(new Date());
	        train3.setArrivalTime(new Date());
	        train3.setFare(13000);
	        
	        Plain plain1 = new Plain();
	        plain1.setId(1);
	        plain1.setDepartureDate(new Date());
	        plain1.setDepartureTime(new Date());
	        plain1.setDepartureStation("Paris");
	        plain1.setDeparturePlatform("First");
	        plain1.setArrivalPlace("London");
	        plain1.setArrivalStation("Second");
	        plain1.setArrivalDate(new Date());
	        plain1.setArrivalTime(new Date());
	        plain1.setFare(65000);
	        
	        plain1.setConnectionNumber(3493383);
	        plain1.setCompanyName("Aeroflot");
	        plain1.setBaggageAllowance(50);
	        plain1.setCarryOnBaggageAllowance(10);
	        
	        Plain plain2 = new Plain();
	        plain2.setId(2);
	        plain2.setDepartureDate(new Date());
	        plain2.setDepartureTime(new Date());
	        plain2.setDepartureStation("Miami");
	        plain2.setDeparturePlatform("First");
	        plain2.setArrivalPlace("Baghdad");
	        plain2.setArrivalStation("Second");
	        plain2.setArrivalDate(new Date());
	        plain2.setArrivalTime(new Date());
	        plain2.setFare(500000);
	        
	        plain2.setConnectionNumber(3493383);
	        plain2.setCompanyName("LuftHansa");
	        plain2.setBaggageAllowance(55);
	        plain2.setCarryOnBaggageAllowance(15);
	        
	        Plain plain3 = new Plain();
	        plain3.setId(3);
	        plain3.setDepartureDate(new Date());
	        plain3.setDepartureTime(new Date());
	        plain3.setDepartureStation("Barca");
	        plain3.setDeparturePlatform("First");
	        plain3.setArrivalPlace("Manchester");
	        plain3.setArrivalStation("Second");
	        plain3.setArrivalDate(new Date());
	        plain3.setArrivalTime(new Date());
	        plain3.setFare(300000);
	        
	        plain3.setConnectionNumber(3493383);
	        plain3.setCompanyName("BELAVIA");
	        plain3.setBaggageAllowance(150);
	        plain3.setCarryOnBaggageAllowance(50);
	        
	        
	        transports.setAllBuses(new Buses());
	        transports.setAllTrains(new Trains());
	        transports.setAllPlains(new Plains());
	        
	        transports.getAllBuses().setBuses(Arrays.asList(bus1, bus2, bus3));
	        transports.getAllTrains().setTrains(Arrays.asList(train1, train2, train3));
	        transports.getAllPlains().setPlains(Arrays.asList(plain1,plain2,plain3));
	        
	        try {
	
	            File file = new File(XML_SOURCE);
	            JAXBContext jaxbContext = JAXBContext.newInstance(Transports.class);
	            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
	    		jaxbMarshaller.marshal(transports, file);
	    		jaxbMarshaller.marshal(transports, System.out);
	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	
	    }
}
