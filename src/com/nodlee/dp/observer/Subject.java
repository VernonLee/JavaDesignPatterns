package com.nodlee.dp.observer;

public abstract class Subject {
	
	/**
	 * 添加注册观察者
	 */
	public abstract void registerObserver(Observer o);
	
	/**
	 * 删除观察者
	 */
	public abstract void removeObserver(Observer o);

	/**
	 * 通知所有观察者
	 */
	public abstract void notifyObservers();
}
