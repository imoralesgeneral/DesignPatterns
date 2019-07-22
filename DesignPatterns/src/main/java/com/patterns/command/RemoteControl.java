package com.patterns.command;

/// INVOKER
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	Command everyOnCommand;
	Command everyOffCommand;
	
	public RemoteControl() {
		super();
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
		everyOnCommand = new MacroCommand(onCommands);
		everyOffCommand = new MacroCommand(offCommands);
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot]; 
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot]; 
	}
	
	public void undoButtonWasPushed() {
		undoCommand.execute();
	}
	
	public void totalONwasPushed() {
		everyOnCommand.execute();
		undoCommand = everyOnCommand;
	}
	
	public void totalOFFwasPushed() {
		everyOffCommand.execute();
		undoCommand = everyOffCommand;
	} 
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("------ Remote Control ------\n");
		for(int i=0; i<7; i++) {
			sb.append("[Slot "+i+"] "+onCommands[i].getClass().getSimpleName()+"\t\t\t\t"+offCommands[i].getClass().getSimpleName()+"\n");
		}
		sb.append("[undo] "+undoCommand.getClass().getSimpleName()+"\n");
		sb.append("[ON]\t\t\t\t\t\t[OFF]");
		return sb.toString();
	}
	
}
