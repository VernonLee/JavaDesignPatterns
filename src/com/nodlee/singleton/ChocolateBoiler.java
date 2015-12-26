package com.nodlee.singleton;

public class ChocolateBoiler {
	private static volatile ChocolateBoiler sChocolateBoiler;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (sChocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				if (sChocolateBoiler == null) {
					sChocolateBoiler = new ChocolateBoiler();
				}
			}
		}
		return sChocolateBoiler;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			boiled = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
