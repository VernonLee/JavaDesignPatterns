package com.nodlee.dp.state;

public class StateTest {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.trunCrank();
		System.out.println(gumballMachine);
		
	}

}
