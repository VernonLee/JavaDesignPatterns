package com.nodlee.dp.command;

public class CommandTest {

	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		GarageDoor door = new GarageDoor();
		Stereo stereo = new Stereo();
		CeilingFan ceilingFan = new CeilingFan("");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GargeDoorOpenCommand doorOpen = new GargeDoorOpenCommand(door);
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(door);
		
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand fanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);
		
		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		control.setCommand(1, kitchenLightOn, kitchenLightOff);
		control.setCommand(2, doorOpen, doorClose);
		control.setCommand(3, stereoOn, stereoOff);
		control.setCommand(4, fanHigh, fanOff);
		control.setCommand(5, fanLow, fanOff);
		
		System.out.println(control);
		
		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
		
		control.undoButtonWasPushed();
		
		control.onButtonWasPushed(1);
		control.offButtonWasPushed(1);
		control.onButtonWasPushed(2);
		control.offButtonWasPushed(2);
		control.onButtonWasPushed(3);
		control.offButtonWasPushed(3);
		control.onButtonWasPushed(4);
		control.offButtonWasPushed(4);
		control.onButtonWasPushed(5);
		control.offButtonWasPushed(5);
		
		control.undoButtonWasPushed();
		
		// 复合命令
		Command[] partyOn = {livingRoomLightOn, stereoOn};
		Command[] partyOff = {livingRoomLightOff, stereoOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		control.setCommand(6, partyOnMacro, partyOffMacro);
		control.onButtonWasPushed(6);
		control.offButtonWasPushed(6);
	}

}
