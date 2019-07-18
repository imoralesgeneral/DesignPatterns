package com.patterns.command;

/// CLIENT
public class TestRun {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light();
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanHighCommand livingRoomCeilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand livingRoomCeilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand livingRoomCeilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, livingRoomCeilingFanHigh, livingRoomCeilingFanOff);
		remoteControl.setCommand(2, livingRoomCeilingFanMedium, livingRoomCeilingFanOff);
		remoteControl.setCommand(3, livingRoomCeilingFanLow, livingRoomCeilingFanOff);
		
		System.out.println(remoteControl);
		
		remoteControl.totalONwasPushed();
		remoteControl.totalOFFwasPushed();
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		
		System.out.println(remoteControl);
	}

}
