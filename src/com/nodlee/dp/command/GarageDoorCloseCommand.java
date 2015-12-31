package com.nodlee.dp.command;

public class GarageDoorCloseCommand extends Command {
	private GarageDoor door;
	
	public GarageDoorCloseCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	void execute() {
		door.lightOff();
		door.down();
		door.stop();
	}

	@Override
	void undo() {
		door.lightOn();
		door.up();
		door.stop();
	}
}
