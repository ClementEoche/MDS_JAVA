package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
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
      }else {
    	System.out.println(this.getClass().getSimpleName()+"ne miam pas cette chose");
    }
}

@Override
public void walk() {
	// TODO Auto-generated method stub
	this.walk();
	System.out.println(this.getName()+"Marche");
}

@Override
public void eatVegetable(Vegetable vegetable) {
	// TODO Auto-generated method stub
	System.out.println(this.getClass().getSimpleName()+"miamej");
}
}
