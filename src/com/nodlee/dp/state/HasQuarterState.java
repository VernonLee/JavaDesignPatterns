package com.nodlee.dp.state;

import java.util.Random;

public class HasQuarterState implements State {
	Random randowWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("已经投入了25分钱，不能再投了");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("退款");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void trunCrank() {
		System.out.println("转动曲柄..");
		int winner = randowWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());	
		}
	}

	@Override
	public void dispense() {
		System.out.println("无法发放糖果");
	}

}
