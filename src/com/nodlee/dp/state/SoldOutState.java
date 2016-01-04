package com.nodlee.dp.state;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("不能投入钱，糖果已经买完了");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("没有投钱，无法退款");
	}

	@Override
	public void trunCrank() {
		System.out.println("曲柄转动，但是没有糖果");
	}

	@Override
	public void dispense() {
		System.out.println("糖果已经买完了");
	}

}
