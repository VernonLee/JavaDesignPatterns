package com.nodlee.dp.factory;

public class NYStyleClamPizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public NYStyleClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	void prepare() {
		System.out.println("准备:" + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}

	
}
