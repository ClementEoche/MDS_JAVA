package com.tactfactory.designpatternniveau1.observer.models;

public class ConcreteSubject extends Subject {

	  private int deci;
	  private int data;

	  public ConcreteSubject(int i) {
	    this.deci = i;
	  }

	  public int getData() {
	    return data;
	  }

	  public void setData(int data) {
	    this.data = data;
	    System.out.println(String.format("\nFirst state change : %s", this.deci));
	    this.notifyObservers(this.data);
	  }
	}
