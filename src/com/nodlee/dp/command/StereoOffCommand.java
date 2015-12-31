package com.nodlee.dp.command;

public class StereoOffCommand extends Command {
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	void execute() {
		stereo.setVolume(0);
		stereo.off();
	}

	@Override
	void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
