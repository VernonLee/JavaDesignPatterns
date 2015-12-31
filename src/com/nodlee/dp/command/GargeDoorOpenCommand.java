package com.nodlee.dp.command;

public class GargeDoorOpenCommand extends Command {
	private GarageDoor door;
	
	public GargeDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	void execute() {
		door.up();
		door.stop();
		door.lightOn();
	}

	@Override
	void undo() {
		door.down();
		door.stop();
		door.lightOff();
	}
}
