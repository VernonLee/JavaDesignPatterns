package com.nodlee.dp.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	private ArrayList menuComponents = new ArrayList<>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}
	
	@Override
	public void print() {
		System.out.println("Name:" + name);
		System.out.println("Description:" + description);
		
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}
	
	@Override
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}

}
