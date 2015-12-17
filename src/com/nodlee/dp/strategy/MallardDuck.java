package com.nodlee.dp.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new Quack();
	}

	@Override
	public void swim() {

	}

	@Override
	public void display() {
		// 绿头
	}

}
