package com.nodlee.factory;

public class NYStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	void prepare() {
		System.out.println("准备:" + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}
	
}
