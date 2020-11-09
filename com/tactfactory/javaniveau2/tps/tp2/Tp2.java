package com.tactfactory.javaniveau2.tps.tp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.tactfactory.javaniveau2.tps.tp2.entities.Car;
import com.tactfactory.javaniveau2.tps.tp2.entities.CarType;
import com.tactfactory.javaniveau2.tps.tp2.entities.User;
import com.tactfactory.javaniveau2.tps.tp2.utils.ItemsGenerator;

/**
 *
 * @author tactfactory
 *
 *  - Créer un programme qui permet, en utilisant la fonction "stream()" sur la variable users,
 *      d'afficher les informations suivantes :
 *    - 1 : Le nombre d'utilisateur
 *    - 2 : Le nombre d'utilisateur dans la première lettre du prénom commence par "a"
 *    - 3 : Le nombre d'utilisateur dont le nom et le prénom contienent exactement 5 caractères
 *    - 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16 caractères
 *    - 5 : Les utilisateurs possédant une voiture de la marque "marque1"
 *    - 6 : La première voiture avec le plus haut kilométrage
 *    - 7 : La liste des voitures avec le plus haut kilométrage
 *    - 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
 *    - 9 : Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque
 *    -10 : La liste des utilisateurs triée par nom puis par prénom
 */
public class Tp2 {

  public static void main(String[] args) {
    List<User> users = ItemsGenerator.generateUsers();

    for (User user : users) {
      System.out.println(user);
    }

    //1 : Le nombre d'utilisateur
   long nbUsers = users.stream().distinct().count();
   System.out.println(String.format("%s %d", "Nombre d'utilisateur", nbUsers));

    // 2 : Le nombre d'utilisateur dans la première lettre du prénom commence par "a"
   long nbUsersA = users.stream().filter(x -> x.getFirstname().substring(0,1).equals("a")).count();
    System.out.println(
      String.format("%s %d", "Nombres d'utilisateur dans la première lettre du prénom commence par \"a\"", nbUsersA));

    // 3 : Le nombre d'utilisateur dont le nom et le prénom contienent exactement 5 caractères
    long nbUsersFLName5 = users.stream().filter(x -> x.getFirstname().length()==5).filter(y -> y.getLastname().length()==5).count();
    System.out.println(String.format("%s %d",
        "Les utilisateurs dont le nom et le prénom contienent exactement 5 caractères", nbUsersFLName5));

    // 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16 caractères
    long nbUsersFullname1316 = users.stream().filter(x -> x.getFirstname().length() >= 13).filter(x -> x.getFirstname().length() <= 16).count();
    System.out.println(String.format("%s %d", "Les utilisateurs dont le full name contient entre 13 et 16 caractères",
        nbUsersFullname1316));

    // 5 : Les utilisateurs possédant une voiture de la marque "marque1"
    List<User> usersCarMarque1 = users.stream().filter(x ->  x.getCar().getCarType().getMark().equals("marque1")).collect(Collectors.toList());
    System.out.println("Les utilisateurs possédant une voiture de la marque \"marque1\"");
    for (User user : usersCarMarque1) {
      System.out.println(String.format("\t%s", user));
    }

    // 6 : La première voiture avec le plus haut kilométrage
    Car carMaxMileage = users.stream().collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar();
    System.out.println(String.format("%s %s", "La voiture avec le plus haut kilométrage", carMaxMileage));

    // 7 : La liste des voitures avec le plus haut kilométrage
    /*
    long maxKm = users.stream().collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar().getMileage();
    List<User> carMaxMileages = users.stream().filter(x -> x.getCar().getMileage() == maxKm).collect(Collectors.toList());
    System.out.println("La liste des voitures avec le plus haut kilométrage");
    List<Car> userCar = new ArrayList<Car>();
    userCar = ((User) carMaxMileages).getCar();
    for (Car car : userCar) {
      System.out.println(String.format("\t%s", car));
   }*/
    
    long maxKm = users.stream().collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar().getMileage();
    List<Car> carMaxMileages = new ArrayList<Car>();
    users.stream().filter(x -> x.getCar().getMileage() == maxKm).forEach(x -> carMaxMileages.add(x.getCar()));
    System.out.println("La liste des voitures avec le plus haut kilométrage");
    for (Car car : carMaxMileages) {
      System.out.println(String.format("\t%s", car));
    }

    // 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
    /*Entry<String, List<User>> markMaxCar = users.stream().filter(predicate);
    System.out.println(String.format("%s est %s avec %d voitures", "La marque possédant le plus de voiture",
        markMaxCar.getKey(), markMaxCar.getValue().size()));*/

    // 9 : Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque
//    int minCars = users.stream();
//    List<Entry<String, List<Car>>> markMinCars = users.stream();
//    System.out.println("Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque");
//    for (Entry<String, List<Car>> entry : markMinCars) {
//      System.out.println("\t" + entry.getKey() + " :");
//      for (Car car : entry.getValue()) {
//        System.out.println("\t\t" + car);
//      }
//    }

    // 10 : La liste des utilisateurs triée par nom puis par prénom
//    List<User> sortedUsers = users.stream();
//    System.out.println("La liste des utilisateurs triée par nom puis par prénom");
//    for (User user : sortedUsers) {
//      System.out.println("\t" + user);
//    }
  }

}
