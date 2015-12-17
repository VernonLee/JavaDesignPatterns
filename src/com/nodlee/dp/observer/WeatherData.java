package com.nodlee.dp.observer;

import java.util.ArrayList;

public class WeatherData extends Subject {
	private ArrayList<Observer> observers;
	private float tempture;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float tempture, float humidity, float pressure) {
		this.tempture = tempture;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >=0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(tempture, humidity, pressure);
		}
	}
}
