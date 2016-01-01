package com.nodlee.dp.facade;

public class FacadeTest {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		DvdPlayer dvd = new DvdPlayer();
		Projector projector = new Projector();
		ThreaterLights lights = new ThreaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);
		homeTheater.watchMovie("The A Team");
		homeTheater.endMovie();
	}
}
