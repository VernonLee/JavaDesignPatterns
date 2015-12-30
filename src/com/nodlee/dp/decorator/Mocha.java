package com.nodlee.dp.decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .12 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

}
