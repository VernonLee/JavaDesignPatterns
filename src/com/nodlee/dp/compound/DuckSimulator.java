package com.nodlee.dp.compound;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	void simulate() {
		AbstractDuckFactory duckFactory = new DuckFactory();
		Quackable redHeadDuck = duckFactory.createRedheadDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator");
		
		simulate(redHeadDuck);
		simulate(rubberDuck);
		simulate(mallardDuck);
		simulate(duckCall);
		simulate(gooseAdapter);
		
		System.out.println("The duck quacked" 
				+ QuackCounter.getNumOfQuacks() + " times");
		
		Quackable duckCall1 = duckFactory.createDuckCall();
		Quackable duckCall2 = duckFactory.createDuckCall();
		Quackable duckCall3 = duckFactory.createDuckCall();
		
		Flock flockOfDuckCalls = new Flock();
		flockOfDuckCalls.add(duckCall1);
		flockOfDuckCalls.add(duckCall2);
		flockOfDuckCalls.add(duckCall3);
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(flockOfDuckCalls);
		
		System.out.println("\nDuck Simulator: Whole Duck Quacks");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Whole Duck Call Quacks");
		simulate(flockOfDuckCalls);
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
