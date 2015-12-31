package com.nodlee.dp.command;

public class LightOffCommand extends Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	void execute() {
		light.off();
	}

	@Override
	void undo() {
		light.on();
	}

}
