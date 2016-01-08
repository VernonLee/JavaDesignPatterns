package com.nodlee.dp.compound;

/**
 * 装饰者模式
 * @author nodlee
 *
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numOfQuacks;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		duck.quack();
		numOfQuacks++;
		notifyObservers();
	}
	
	public static int getNumOfQuacks() {
		return numOfQuacks;
	}
	

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
