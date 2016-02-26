package com.bsuir.lab2.runner;

import java.util.Arrays;
import java.util.List;

import com.bsuir.lab2.absract_factory.impl.JSONFactory;
import com.bsuir.lab2.absract_factory.impl.XMLFactory;
import com.bsuir.lab2.builder.FactoryBuilder;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.obserber.MonitorTransportStorage;
import com.bsuir.lab2.report.ReportService;
import com.bsuir.lab2.storage.TransportStorage;
import com.bsuir.lab2.type.SourceType;

public class Runner {

	public static void main(String args[]) {

		TransportStorage storage = new TransportStorage();

		MonitorTransportStorage monitor = new MonitorTransportStorage(storage);

		storage.add(new Bus());
		storage.add(new Bus());
		storage.add(new Bus());
		// if (Arrays.asList(args).contains(SourceType.XML.toString())) {
		// storage.setAllTransport(FactoryBuilder.getInstance().build(new
		// XMLFactory()));
		// } else if (Arrays.asList(args).contains(SourceType.JSON.toString()))
		// {
		// storage.setAllTransport(FactoryBuilder.getInstance().build(new
		// XMLFactory()));
		// } else {
		// throw new RuntimeException("Source type has not been defined
		// properly. Please use: "
		// + SourceType.XML.toString() + " and " + SourceType.JSON.toString());
		// }
		//
		// if (storage.getAllTransport() != null &&
		// !storage.getAllTransport().isEmpty())
		// toReport(storage);
	}

	private static void toFilter(TransportStorage storage) {

	}

	private static void toReport(TransportStorage storage) {

		ReportService reportService = new ReportService();
		reportService.listToHtml(storage);
		reportService.listToJPG(storage);
	}
}
