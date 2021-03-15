package com.tactfactory.designpatternniveau1.observer.models;

public class ConcreteObserverHexa implements Observer {

	  private String name;

	  public ConcreteObserverHexa(String name) {
	    this.name = name;
	  }
	  
	  @Override
	  public void update(int i) {
	    System.out.println(String.format("From %s", this.name));
	    System.out.println("Hexa :"+ Integer.toHexString(i).toUpperCase());
	  }
	}
