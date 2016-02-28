package com.bsuir.lab2.filter;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.storage.TransportStorage;

public class CustomFilter {

	private static final String RESTRICTION = "src/main/resources/restriction/restriction.json";

	public void execute(TransportStorage storage) {
		FilterEntry filter = getFilterEntryFromJSON();
		List<Transport> filteredList = getListFromTransportStorage(storage);

		if (filter.getFrom() != null && filter.getTo() != null)
			runDateFilter(filter, filteredList);

		if (filter.getArrivalPlace() != null && filter.getDeparturePlace() != null)
			runPlaceFilter(filter, filteredList);

		if (filter.getNearlestTransportCount() != null)
			filteredList = runNearlestNumberFilter(filter, filteredList);

		pushToStorage(storage, filteredList);
	}

	private FilterEntry getFilterEntryFromJSON() {

		FilterEntry filter = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			filter = mapper.readValue(new File(RESTRICTION), FilterEntry.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return filter;
	}

	private void runDateFilter(FilterEntry filter, List<Transport> tranportToFilter) {
		DateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date from = null;
		Date to = null;
		try {
			from = dateFormatter.parse(filter.getFrom());
			to = dateFormatter.parse(filter.getTo());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Iterator<Transport> iterator = tranportToFilter.iterator();
		while (iterator.hasNext()) {
			Transport transport = (Transport) iterator.next();

			if (!from.before(transport.getArrivalDate()) || !to.after(transport.getDepartureDate()))
				iterator.remove();

		}
	}

	private void runPlaceFilter(FilterEntry filter, List<Transport> tranportToFilter) {

		Iterator<Transport> iterator = tranportToFilter.iterator();
		while (iterator.hasNext()) {
			Transport transport = (Transport) iterator.next();

			if (!filter.getArrivalPlace().equals(transport.getArrivalPlace())
					|| !filter.getDeparturePlace().equals(transport.getDepartureStation()))
				iterator.remove();

		}
	}

	private List<Transport> runNearlestNumberFilter(FilterEntry filter, List<Transport> tranportToFilter) {

		Collections.sort(tranportToFilter, new Comparator<Transport>() {
			public int compare(Transport o1, Transport o2) {
				if (o1.getArrivalDate().before(o2.getArrivalDate()))
					return 1;

				return -1;
			}
		});

		if (!(tranportToFilter.size() < 5))
			return tranportToFilter.subList(0, 5);

		return tranportToFilter;
	}

	private void pushToStorage(TransportStorage storage, List<Transport> filteredList) {
		for (Transport transport : filteredList) {
			storage.add(transport);
		}
	}

	private List<Transport> getListFromTransportStorage(TransportStorage storage) {
		List<Transport> allTransport = new ArrayList<Transport>();
		allTransport.addAll(storage.getAllTransport());
		storage.getAllTransport().clear();
		return allTransport;
	}
}
