package com.nodlee.dp.command;

public class NoCommand extends Command {

	public NoCommand() {
	}

	@Override
	void execute() {
		System.out.println("do nothing");
	}

	@Override
	void undo() {
		
	}

}
