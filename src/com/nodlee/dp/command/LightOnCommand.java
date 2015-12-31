package com.nodlee.dp.command;

public class LightOnCommand extends Command {
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	void execute() {
		light.on();
	}

	@Override
	void undo() {
		light.off();
	}

}
