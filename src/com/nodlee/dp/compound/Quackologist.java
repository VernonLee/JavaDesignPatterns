package com.nodlee.dp.compound;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist:" + duck + " Just quacked.");
	}

}
