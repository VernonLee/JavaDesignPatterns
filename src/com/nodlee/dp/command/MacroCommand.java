package com.nodlee.dp.command;

public class MacroCommand extends Command {
	private Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	void undo() {
	}

}
