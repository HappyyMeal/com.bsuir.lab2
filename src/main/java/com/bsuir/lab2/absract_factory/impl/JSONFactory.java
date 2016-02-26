package com.bsuir.lab2.absract_factory.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

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

	private static final String BUS_JSON_SOURCE = "src/main/resources/json/bus.json";
	private static final String TRAIN_JSON_SOURCE = "src/main/resources/json/train.json";
	private static final String PLAIN_JSON_SOURCE = "src/main/resources/json/plain.json";

	public List<Transport> create() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			List<Train> trains = mapper.readValue(new File(TRAIN_JSON_SOURCE), new TypeReference<List<Train>>() {
			});
			List<Bus> buses = mapper.readValue(new File(BUS_JSON_SOURCE), new TypeReference<List<Bus>>() {
			});
			List<Bus> buses = mapper.readValue(new File(BUS_JSON_SOURCE), new TypeReference<List<Bus>>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
