package com.bsuir.lab2.runner;

import java.util.Arrays;
import java.util.List;

import com.bsuir.lab2.absract_factory.impl.JSONFactory;
import com.bsuir.lab2.absract_factory.impl.XMLFactory;
import com.bsuir.lab2.builder.FactoryBuilder;
import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.type.SourceType;

public class Runner {

	public static void main(String args[]) {

		List<Transport> allTransports;

		if (Arrays.asList(args).contains(SourceType.XML.toString())) {
			allTransports = FactoryBuilder.getInstance().build(new XMLFactory());
		} else if (Arrays.asList(args).contains(SourceType.JSON.toString())) {
			allTransports = FactoryBuilder.getInstance().build(new JSONFactory());
		} else {
			throw new RuntimeException("Source type has not been defined properly. Please use: "
					+ SourceType.XML.toString() + " and " + SourceType.JSON.toString());
		}

		if (allTransports != null && !allTransports.isEmpty())
			toReport(allTransports);
	}

	private static void toReport(List<Transport> alList) {
		// JFreeChart

	}
}
