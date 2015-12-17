package com.nodlee.dp.strategy;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new Quack();
	}

	public void swim() {

	}

	@Override
	public void display() {
		
	}

}
