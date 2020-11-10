package fr.mds.javadesignpattern.tps.tp1_1.utils;

import java.util.ArrayList;
import java.util.List;

import fr.mds.javadesignpattern.tps.tp1_1.entity.Entity1;

public class EntityHandler {
	private static EntityHandler instance = null;
	private static List<Entity1> result = new ArrayList<Entity1>();

	public EntityHandler() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 20; i++) {
	          Entity1 e1 = new Entity1();
	          e1.setId(i);
	          e1.setData("data " + i);
	          result.add(e1);
	        }
	}
	
	
    public static EntityHandler getInstance() {
        if (instance == null) {
            instance = new EntityHandler();
        }

        return instance;
    }


    public static List<Entity1> getEntity1s(){
        return result;
      }
}
