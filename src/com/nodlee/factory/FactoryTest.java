package com.nodlee.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// 我要一个纽约风味披萨
		NYStylePizzaStore nyPizzaStore = new NYStylePizzaStore();
		nyPizzaStore.orderPizza("cheese");
		
		// 我要一个芝加哥风味披萨
		ChicagoStylePizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("cheese");
	}
}
