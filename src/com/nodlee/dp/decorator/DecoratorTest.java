package com.nodlee.dp.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Mocha(espresso);
		espresso = new Soy(espresso);
		espresso = new Whip(espresso);
		System.out.println("description:" + espresso.getDescription() + " cost:" + espresso.cost());
	}

}
