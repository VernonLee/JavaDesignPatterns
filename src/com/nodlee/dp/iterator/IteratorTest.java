package com.nodlee.dp.iterator;

import java.util.ArrayList;

public class IteratorTest {

	public static void main(String[] args) {

		Menu pancakeHosueMenu = new PancakeHouseMenu();
		Menu dinnerMenu = new DinnerMenu();

		ArrayList allMenus = new ArrayList<>();
		allMenus.add(pancakeHosueMenu);
		allMenus.add(dinnerMenu);

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
