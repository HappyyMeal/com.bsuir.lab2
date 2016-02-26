package com.bsuir.lab2.storage;

import java.util.ArrayList;
import java.util.List;

import com.bsuir.lab2.model.Transport;
import com.bsuir.lab2.obserber.Observable;
import com.bsuir.lab2.obserber.Observer;

public class TransportStorage implements GenericContainer, Observable {
	private List<Transport> allTransport;
	private List<Observer> observers;

	public TransportStorage() {
		allTransport = new ArrayList<Transport>();
		observers = new ArrayList<Observer>();
	}

	public void setAllTransport(List<Transport> allTransport) {
		this.allTransport = allTransport;
	}

	public List<Transport> getAllTransport() {
		return allTransport;
	}

	public void add(Transport transport) {
		allTransport.add(transport);
		notifyObservers();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {

		for (Observer observer : observers) {
			observer.add(allTransport.size());
		}
	}

	private class TransportIterator implements Iterator {
		int index;

		public boolean hasNext() {
			if (index < allTransport.size()) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return allTransport.get(index++);
			}
			return null;
		}
	}

	public Iterator getIterator() {
		return new TransportIterator();
	}
}
