package com.nodlee.dp.observer;

public class ObserverTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay staticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(20, 23, 28);
		weatherData.setMeasurements(21, 26, 23);
		weatherData.setMeasurements(12, 42, 42);
	}
}
