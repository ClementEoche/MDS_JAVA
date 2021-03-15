package com.tactfactory.designpatternniveau1.observer.models;

public class ConcreteObserverBina implements Observer{
	private String name;

	  public ConcreteObserverBina(String name) {
	    this.name = name;
	  }
	  
	  public String intToBina(int i) {
		return Integer.toBinaryString(i);
	  }
	  
	  public void update(int i) {
	    System.out.println(String.format("From %s", this.name));
	    System.out.println("Binary :"+ Integer.toBinaryString(i));
	  }
}
