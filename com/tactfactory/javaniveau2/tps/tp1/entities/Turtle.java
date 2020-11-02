package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
	  this.swim();
	  this.walk();
  }

  @Override
  public void eat(Eatable eatable) {
	  	if (eatable instanceof Vegetable) {
	          this.eatVegetable((Vegetable)eatable);
	        }else if(eatable instanceof Animal) {
	      	this.eatAnimal((Animal)eatable);
	      }else {
	      	System.out.println("C'est bizarre ton truk la");
	      }
	  }

	  @Override
	  public void eatVegetable(Vegetable vegetable) {
	  	// TODO Auto-generated method stub
	  	System.out.println("miamej vegeto");
	  }

	  @Override
	  public void eatAnimal(Animal animal) {
	  	// TODO Auto-generated method stub
	  	System.out.println("miamej animo");
	  }

  @Override
  public void walk() {
	  System.out.println(this.getName()+"Marche");
  }
  public void swim() {
  	// TODO Auto-generated method stub
  	
  	System.out.println(this.getName()+"Naj");
  }
}
