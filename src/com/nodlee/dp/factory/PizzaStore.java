package com.nodlee.dp.factory;

public abstract class PizzaStore {
	
	public PizzaStore() {
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	// 把创建对象交给具体子类
	public abstract Pizza createPizza(String type);
}
