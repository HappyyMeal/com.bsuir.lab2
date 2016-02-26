package com.bsuir.lab2.report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.model.impl.Bus;
import com.bsuir.lab2.model.impl.Plain;
import com.bsuir.lab2.model.impl.Train;
import com.bsuir.lab2.storage.Iterator;
import com.bsuir.lab2.storage.TransportStorage;

public class ReportService {

	private static final String HTML_OUTPUT = "src/main/resources/report/report.html";
	private static final String JPG_OUTPUT = "src/main/resources/report/report.jpg";

	public void listToHtml(TransportStorage storage) {

		String builtReport = htmlReportAsString(storage);
		writeToFile(builtReport, HTML_OUTPUT);
	}

	public void listToJPG(TransportStorage storage) {
		DefaultPieDataset dataset = new DefaultPieDataset();

		int buses = 0;
		int trains = 0;
		int plaines = 0;
		for (Iterator iter = storage.getIterator(); iter.hasNext();) {
			Transport transport = (Transport) iter.next();
			if (transport instanceof Bus) {
				buses++;
			} else if (transport instanceof Train) {
				trains++;
			} else if (transport instanceof Plain) {
				plaines++;
			}
		}

		dataset.setValue("Bus", buses);
		dataset.setValue("Train", trains);
		dataset.setValue("Plain", plaines);

		JFreeChart chart = ChartFactory.createPieChart("Transport scheme", dataset, true, true, false);
		writeToJPG(chart);
	}

	private String htmlReportAsString(TransportStorage storage) {
		StringBuilder html = new StringBuilder();
		html.append("<html><head><title>").append("Transports").append("</title></head>").append("<body>");

		for (Iterator iter = storage.getIterator(); iter.hasNext();) {
			Transport transport = (Transport) iter.next();
			DateFormat justDate = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat justTime = new SimpleDateFormat("HH:mm");
			html.append(
					"<div style='float:left; width:271px; padding: 10px 5px;'><table border='2' style='height: 348px;'><tr style='background:#D02C19;'><td>Transport</td><td>")
					.append(transport.getClass().getSimpleName()).append("</td></tr>").append("<tr><td>ID</td><td>")
					.append(transport.getId()).append("</td></tr>").append("<tr><td>Departure Date</td><td>")
					.append(justDate.format(transport.getDepartureDate())).append("</td></tr>")
					.append("<tr><td>Departure Time</td><td>").append(justTime.format(transport.getDepartureTime()))
					.append("</td></tr>").append("<tr><td>Departure Station</td><td>")
					.append(transport.getDepartureStation()).append("</td></tr>")
					.append("<tr><td>Departure Platform</td><td>").append(transport.getDeparturePlatform())
					.append("</td></tr>").append("<tr><td>Arrival Place</td><td>").append(transport.getArrivalPlace())
					.append("</td></tr>").append("<tr><td>Arrival Station</td><td>")
					.append(transport.getArrivalStation()).append("</td></tr>").append("<tr><td>Arrival Date</td><td>")
					.append(justDate.format(transport.getArrivalDate())).append("</td></tr>")
					.append("<tr><td>Arrival Time</td><td>").append(justTime.format(transport.getArrivalTime()))
					.append("</td></tr>").append("<tr><td>Fare</td><td>").append(transport.getFare())
					.append("</td></tr>");

			if (transport instanceof Bus) {
				Bus bus = (Bus) transport;
				html.append("<tr><td>Mark</td><td>").append(bus.getMark()).append("</td></tr>")
						.append("<tr><td>Journey Time</td><td>").append(bus.getJourneyTime()).append("</td></tr>");

			} else if (transport instanceof Plain) {
				Plain plain = (Plain) transport;
				html.append("<tr><td>Available connections</td><td>").append(plain.getConnectionNumber())
						.append("</td></tr>").append("<tr><td>Company name</td><td>").append(plain.getCompanyName())
						.append("</td></tr>").append("<tr><td>Baggage allowance</td><td>")
						.append(plain.getBaggageAllowance()).append("</td></tr>")
						.append("<tr><td>Carry on baggage allowance</td><td>")
						.append(plain.getCarryOnBaggageAllowance()).append("</td></tr>");
			}

			html.append("</table></div>");
		}

		html.append("</body>");
		return html.toString();

	}

	private FileWriter writeToFile(String outputText, String fileName) {
		File output = null;
		FileWriter fileWriter = null;

		output = new File(fileName);
		try {
			fileWriter = new FileWriter(output);
			fileWriter.write(outputText);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Report output file has not been created due to:" + e.getMessage());
			e.printStackTrace();
		}

		return fileWriter;
	}

	private void writeToJPG(JFreeChart chart) {
		int width = 940; /* Width of the image */
		int height = 660; /* Height of the image */

		File jpegOutput = new File(JPG_OUTPUT);

		try {
			ChartUtilities.saveChartAsJPEG(jpegOutput, chart, width, height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
