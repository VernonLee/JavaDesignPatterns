package com.nodlee.dp.factory;

public class NYStylePizzaStore extends PizzaStore {
	NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
		case "cheese":
			pizza = new NYStyleCheesePizza(factory);
			pizza.setName("纽约风味芝士披萨");
			break;
		case "clam":
			pizza = new NYStyleClamPizza(factory);
			pizza.setName("纽约风味哈喇披萨");
			break;
		case "pepperoni":
			pizza = new NYStylePepperoniPizza(factory);
			pizza.setName("纽约风味香肠披萨");
			break;
		case "veggie":
			pizza = new NYStyleVeggiePizza(factory);
			pizza.setName("纽约风味素食披萨");
			break;
		}
		return pizza;
	}

}
