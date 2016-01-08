package com.nodlee.dp.compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式
 * @author nodlee
 */
public class Flock implements Quackable {
	ArrayList quackers = new ArrayList<>();
	Observable observable;
	
	public Flock() {
		observable = new Observable(this);
	}
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		// 迭代器模式
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
		notifyObservers();
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
