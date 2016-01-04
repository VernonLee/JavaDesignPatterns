package com.nodlee.dp.state;

public class GumballMachine {
	State hasQuarterState;
	State noQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;

	State state = soldOutState;
	private int count = 0;

	public GumballMachine(int gunballNum) {
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);

		count = gunballNum;
		if (count > 0) {
			state = noQuarterState;
		}
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("发放糖果");
		if (count != 0) {
			count = count - 1;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void trunCrank() {
		state.trunCrank();
		state.dispense();
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		String stateStr = null;
		return "state:" + stateStr + "  count:" + count;
	}
}
