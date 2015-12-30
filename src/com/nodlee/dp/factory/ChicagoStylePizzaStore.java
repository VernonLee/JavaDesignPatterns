package com.nodlee.dp.factory;

public class ChicagoStylePizzaStore extends PizzaStore {
	ChicagoPizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
		case "cheese":
			pizza = new ChicagoStyleCheesePizza(factory);
			pizza.setName("芝加哥风味芝士披萨");
			break;
		case "clam":
			pizza = new ChicagoStyleClamPizza(factory);
			pizza.setName("芝加哥风味哈喇披萨");
			break;
		case "pepperoni":
			pizza = new ChicagoStylePepperoniPizza(factory);
			pizza.setName("芝加哥风味香肠披萨");
			break;
		case "veggie":
			pizza = new ChicagoStyleVeggiePizza(factory);
			pizza.setName("芝加哥风味素食披萨");
			break;
		}
		return pizza;
	}

}
