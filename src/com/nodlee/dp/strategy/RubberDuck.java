package com.nodlee.dp.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void swim() {

	}

	@Override
	public void display() {

	}

}
