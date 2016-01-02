package com.nodlee.dp.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponect = (MenuComponent) iterator.next();
			try {
				if (menuComponect.isVegetarian()) {
					menuComponect.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}

}
