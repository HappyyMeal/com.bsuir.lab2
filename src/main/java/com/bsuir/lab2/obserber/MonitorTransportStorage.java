package com.bsuir.lab2.obserber;

import com.bsuir.lab2.storage.TransportStorage;

public class MonitorTransportStorage implements Observer {

	private TransportStorage storage;
	private int transportCompacity;

	public MonitorTransportStorage(TransportStorage storage) {
		this.storage = storage;
		storage.registerObserver(this);
	}

	public void add(int listCompacity) {
		transportCompacity = listCompacity;
		display();
	}

	public void display() {
		System.out.println("Transports storage was changed. Current transpots amount: " + transportCompacity);
	}

}
