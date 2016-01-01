package com.nodlee.dp.templateMethod;

public class TemplateMethodTest {
	public static void main(String[] args) {
	
		CaffeineBeverageWithHook coffee = new CoffeeWithHook();
		coffee.prepareRecipe();
		
		CaffeineBeverageWithHook tea = new Tea();
		tea.prepareRecipe();
	}
}
