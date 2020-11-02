package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
	  this.swim();
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
  public void swim() {
  	// TODO Auto-generated method stub
  	
  	System.out.println(this.getName()+"Marche");
  }

  @Override
  public void eatAnimal(Animal animal) {
  	System.out.println(this.getClass().getSimpleName()+"miamej");
  }
}
