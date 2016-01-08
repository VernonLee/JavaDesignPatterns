package com.nodlee.dp.compound;


public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
