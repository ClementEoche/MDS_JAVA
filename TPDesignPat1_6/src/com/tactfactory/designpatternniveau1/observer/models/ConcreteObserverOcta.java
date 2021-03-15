package com.tactfactory.designpatternniveau1.observer.models;

public class ConcreteObserverOcta implements Observer{
	private String name;

	  public ConcreteObserverOcta(String name) {
	    this.name = name;
	  }

	  public void update(int i) {
	    System.out.println(String.format("From %s", this.name));
	    System.out.println("Octal :"+ Integer.toOctalString(i));
	  }
}
