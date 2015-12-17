package com.nodlee.dp.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;
	private float tempture;
	private float humidity;
	private float pressure;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("tempture:" + tempture + "humidity:" + humidity
				+ "pressure:" + pressure);
	}

	@Override
	public void update(float tempture, float humidity, float pressure) {
		this.tempture = tempture;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
