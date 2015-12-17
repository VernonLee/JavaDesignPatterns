package com.nodlee.dp.observer;

public class ForecastDisplay implements DisplayElement, Observer {
	private WeatherData weatherData;
	private float tempture;
	private float humidity;
	private float pressure;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float tempture, float humidity, float pressure) {
		this.tempture = tempture;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("tempture:" + tempture + "humidity:" + humidity
				+ "pressure:" + pressure);
	}

}
