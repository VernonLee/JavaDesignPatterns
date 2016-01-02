package com.nodlee.dp.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	private ArrayList menuitems;
	
	public PancakeHouseMenu() {
		menuitems = new ArrayList<>();
				
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		
		addItem("Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
		
		addItem("Blueberry Pancake Breakfast", 
				"Pancakes with fresh blueberry", 
				true,
				3.99);
		
		addItem("Waffles", 
				"Waffles, with your choice of blueberries or strawberries", 
				true,
				3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuitems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuitems);
	}
}
