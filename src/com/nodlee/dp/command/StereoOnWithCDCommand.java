package com.nodlee.dp.command;

public class StereoOnWithCDCommand extends Command {
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	void undo() {
		stereo.setVolume(0);
		stereo.off();
	}

}
