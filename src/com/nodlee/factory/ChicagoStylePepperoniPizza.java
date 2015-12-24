package com.nodlee.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientfactory) {
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
