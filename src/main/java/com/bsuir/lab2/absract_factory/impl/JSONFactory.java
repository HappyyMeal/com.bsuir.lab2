package com.bsuir.lab2.absract_factory.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Train;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JSONFactory implements AbstractFactory {

	private static final String JSON_SOURCE = "src/main/resources/source.json";

	public List<Transport> create() {
		ObjectMapper mapper = new ObjectMapper();

		/*
		 * Bus bus = new Bus();
		 * 
		 * bus.setId(12); bus.setDepartureDate(new Date());
		 * bus.setDepartureTime(new Date()); bus.setDeparturePlatform(
		 * "Platform 1"); bus.setDepartureStation("Departure station");
		 * bus.setArrivalPlace("Arrival place"); bus.setArrivalStation(
		 * "Arrival station"); bus.setArrivalDate(new Date());
		 * bus.setArrivalTime(new Date()); bus.setFare(12.2);
		 * bus.setJourneyTime(12); bus.setMark("BMW");
		 * 
		 * Train train = new Train();
		 * 
		 * train.setId(12); train.setDepartureDate(new Date());
		 * train.setDepartureTime(new Date()); train.setDeparturePlatform(
		 * "Platform 2"); train.setDepartureStation("Departure station");
		 * train.setArrivalPlace("Arrival place"); train.setArrivalStation(
		 * "Arrival station"); train.setArrivalDate(new Date());
		 * train.setArrivalTime(new Date()); train.setFare(12.2);
		 * 
		 * List<Object> list = new ArrayList<Object>(); list.add(bus);
		 * list.add(train);
		 */

		// mapper.writeValue(new File(JSON_SOURCE), list);
		try {
			parseJson();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private List<Transport> parseJson() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		List<Transport> transports = new ArrayList<Transport>();

		JsonParser jParser = new JsonParser();
		JsonArray jsonEntities = jParser.parse(new FileReader(new File(JSON_SOURCE))).getAsJsonArray();

		for (JsonElement fileEntry : jsonEntities) {

			JsonObject jsonObj = fileEntry.getAsJsonObject();
			transports.add(processJsonEntity(jsonObj));
		}

		for (Transport transport : transports) {
			System.out.println(transport.getClass().getSimpleName());
		}

		return null;
	}

	private Transport processJsonEntity(JsonObject jsonObj) {

		String objectType = jsonObj.get("type").getAsString();
		if ("bus".equals(objectType)) {
			return createBus(jsonObj);
		} else if ("train".equals(objectType)) {
			return createTrain(jsonObj);
		}

		return null;
	}

	private Bus createBus(JsonObject jsonObj) {

		Bus bus = new Bus();
		bus.setId(jsonObj.get("id").getAsInt());
		return bus;
	}

	private Train createTrain(JsonObject jsonObj) {

		Train train = new Train();
		train.setId(jsonObj.get("id").getAsInt());
		return train;
	}
}
