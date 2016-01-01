package com.nodlee.dp.facade;

public class HomeTheaterFacade {
	Amplifier amp;
	DvdPlayer dvd;
	Projector projector;
	ThreaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp,
			DvdPlayer dvd,
			Projector projector,
			ThreaterLights lights,
			Screen screen,
			PopcornPopper popper) {
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd();
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.on();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
