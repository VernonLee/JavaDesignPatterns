package com.nodlee.dp.command;

public class Stereo {
	private int volume;
	
	public void on() {
		System.out.println("Stereo is on volume:" + volume);
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCd() {
		System.out.println("Set CD");
	}
	
	public void setDvd() {
		System.out.println("Set DVD");
	}
	
	public void setRadio() {
		System.out.println("Set Radio");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
