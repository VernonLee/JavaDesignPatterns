package com.nodlee.dp.factory;


public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("烘烤中...");
	}
	
	public void cut() {
		System.out.println("切片");
	}
	
	public void box() {
		System.out.println("装盒");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
