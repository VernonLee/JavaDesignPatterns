package com.nodlee.dp.facade;

public class Amplifier {
	private int volume;
	
	public void on() {
		System.out.println("Amplifier is on");
	}
	
	public void off() {
		System.out.println("Amplifier is off");
	}
	
	public void setDvd() {
		System.out.println("set dvd");
	}
	
	public void setSurroundSound() {
		System.out.println("set surroundsound");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}
