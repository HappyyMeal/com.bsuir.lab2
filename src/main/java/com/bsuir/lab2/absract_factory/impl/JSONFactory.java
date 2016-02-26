package com.bsuir.lab2.absract_factory.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;

public class JSONFactory implements AbstractFactory {

	private static final String BUS_JSON_SOURCE = "src/main/resources/json/bus.json";
	private static final String TRAIN_JSON_SOURCE = "src/main/resources/json/train.json";
	private static final String PLAIN_JSON_SOURCE = "src/main/resources/json/plain.json";

	public List<Transport> create() {
		ObjectMapper mapper = new ObjectMapper();

		List<Transport> allTransport = new ArrayList<Transport>();
		List<Train> trains = null;
		List<Bus> buses = null;
		List<Plain> plaines = null;

		try {
			trains = mapper.readValue(new File(TRAIN_JSON_SOURCE), new TypeReference<List<Train>>() {});
			buses = mapper.readValue(new File(BUS_JSON_SOURCE), new TypeReference<List<Bus>>() {});
			plaines = mapper.readValue(new File(PLAIN_JSON_SOURCE), new TypeReference<List<Bus>>() {});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		allTransport.addAll(trains);
		allTransport.addAll(buses);
		allTransport.addAll(plaines);

		return allTransport;
	}
}
