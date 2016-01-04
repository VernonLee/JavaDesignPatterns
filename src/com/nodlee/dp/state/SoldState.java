package com.nodlee.dp.state;

public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("请等待...正在发放糖果");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("已经转动曲柄，无法退款");
	}

	@Override
	public void trunCrank() {
		System.out.println("转两次曲柄不会多给你糖果的");
	}

	@Override
	public void dispense() {	
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			System.out.println("糖果买完了");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
	}

}
