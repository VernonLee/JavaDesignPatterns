package com.nodlee.decorator;

public abstract class Beverage {
	protected String description = "Unknown description";

	public enum Size {
		TALL, GRANDE, VENTI
	}

	public String getDescription() {
		return description;
	};
	
	public abstract double cost();

}
