package com.nodlee.factory;

public class NYStylePepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public NYStylePepperoniPizza(PizzaIngredientFactory ingredientfactory) {
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
