package com.tactfactory.designpatternniveau1.command.tp5.models;

public interface Command {

	  public abstract boolean execute() throws CloneNotSupportedException;
	  
	  public Stock getStock();
	  
	  public abstract boolean undo();

}