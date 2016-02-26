package com.bsuir.lab2.obserber;

public interface Observable {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
