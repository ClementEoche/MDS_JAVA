package fr.mds.javadesignpattern.tps.tp1_1.launcher;

import fr.mds.javadesignpattern.tps.tp1_1.entity.*;
import fr.mds.javadesignpattern.tps.tp1_1.utils.EntityHandler;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  @SuppressWarnings("static-access")
public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", EntityHandler.getEntity1s().stream().count()));

    Entity1 e11 = new Entity1();
    e11.setId(15);
    e11.setData("data e1 15");
    
    EntityHandler.getEntity1s().add(e11);

    Entity1 e12 = new Entity1();
    e12.setId(16);
    e12.setData("data e1 16");

    EntityHandler.getEntity1s().add(e12);
    for (Entity1 item : EntityHandler.getInstance().getEntity1s()) {
      System.out.println(item);
    }
  }

}
