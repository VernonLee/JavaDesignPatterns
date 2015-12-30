package com.nodlee.dp.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return .78;
	}

}
