package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	  this.walk();
}

@Override
public void eat(Eatable eatable) {
	if (eatable instanceof Animal) {
        this.eatAnimal((Animal)eatable);
      }else {
    	System.out.println(this.getClass().getSimpleName()+"ne miam pas cette chose");
    }
}

@Override
public void walk() {
	// TODO Auto-generated method stub
	
	System.out.println(this.getClass().getSimpleName()+"Marche");
}

@Override
public void eatAnimal(Animal animal) {
	System.out.println(this.getClass().getSimpleName()+"miamej");
}
}
