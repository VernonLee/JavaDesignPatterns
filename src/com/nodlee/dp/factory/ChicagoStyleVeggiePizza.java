package com.nodlee.dp.factory;

public class ChicagoStyleVeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;
	
	public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientfactory) {
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
