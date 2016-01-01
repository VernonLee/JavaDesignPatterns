package com.nodlee.dp.adapter;

public class TurkeyAdapter extends Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	void quack() {
		turkey.gobble();
	}

	void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}