package com.nodlee.factory;

public class NYStyleVeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public NYStyleVeggiePizza(PizzaIngredientFactory ingredientfactory) {
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
