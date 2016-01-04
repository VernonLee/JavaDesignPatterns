package com.nodlee.dp.state;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("投入25分钱");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你需要投了钱才可以退款");
	}

	@Override
	public void trunCrank() {
		System.out.println("曲柄转动，但是没有付钱");
	}

	@Override
	public void dispense() {
		System.out.println("先支付才可以发放糖果");
	}

}
