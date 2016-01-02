package com.nodlee.dp.composite;


public class CompositeTest {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");
		
		MenuComponent allMenus = new Menu("ALL MENU", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		// 加入菜单
		dinerMenu.add(new MenuItem("鸡腿饭", "鲜嫩多汁的鸡腿，营养果蔬", false, 18));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("西红柿拌面", "新鲜西红柿，爽滑面条", true, 13));
		
		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
