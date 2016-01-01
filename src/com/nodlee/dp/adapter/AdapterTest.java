package com.nodlee.dp.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		Duck duck = new TurkeyAdapter(turkey);
		testDuck(duck);
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
