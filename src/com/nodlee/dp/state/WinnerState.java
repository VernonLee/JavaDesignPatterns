package com.nodlee.dp.state;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("恭喜你，获得奖励糖果一个");
		gumballMachine.releaseBall();

		if (gumballMachine.getCount() == 0) {
			System.out.println("买完了");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("买完了");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
