package com.nodlee.dp.iterator;

public class DinnerMenuIterator implements Iterator {
	private MenuItem[] menuItems;
	private int position = 0;

	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (menuItems[position] == null || position >= menuItems.length) {
			return false;
		} else {
			return true;
		}
	}

}
