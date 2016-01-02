package com.nodlee.dp.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList menuItems;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position += 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

}
