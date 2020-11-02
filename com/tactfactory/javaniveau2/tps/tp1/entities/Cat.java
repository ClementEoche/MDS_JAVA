package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	
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
	// TODO Auto-generated method stub
	System.out.println("Marchej");
}
}
