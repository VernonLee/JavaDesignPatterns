package com.nodlee.dp.templateMethod;

public abstract class CaffeineBeverageWithHook {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	public void boilWater() {
		System.out.println("Boil water");
	}
	
	public void pourInCup() {
		System.out.println("Pour in cup");
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	boolean customerWantsCondiments() {
		return true;
	}
}
