package com.nodlee.dp.iterator;

import java.util.ArrayList;

public class Waitress {
	private ArrayList menus;
	
	public Waitress(ArrayList menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		for (int i = 0; i < menus.size(); i++) {
			Menu menu = (Menu) menus.get(i);
			Iterator iterator = menu.createIterator();
			printMenu(iterator);
		}
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println("Menu name:" + menuItem.getName());
			System.out.println("Menu price:" + menuItem.getPrice());
			System.out.println("Menu description:" + menuItem.getDescription());
		}
	}

}
