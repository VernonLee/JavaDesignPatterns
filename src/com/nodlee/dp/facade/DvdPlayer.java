package com.nodlee.dp.facade;

public class DvdPlayer {

	public void on() {
		System.out.println("DVD is on");
	}
	
	public void off() {
		System.out.println("DVD is off");
	}
	
	public void play(String movie) {
		System.out.println("DVD  is playing :" + movie);
	}
	
	public void eject() {
		System.out.println("DVD eject");
	}
	
	public void stop() {
		System.out.println("Stop playing");
	}
}
