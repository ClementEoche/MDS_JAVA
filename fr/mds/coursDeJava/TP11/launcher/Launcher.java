package fr.mds.coursDeJava.TP11.launcher;

import java.util.Scanner;

import fr.mds.coursDeJava.TP11.utils.Conjugateur;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Conjugateur conj = new Conjugateur();
		String input = "1";
		
		conj.toutConjugue();
		
		System.out.println("ENTRE UN VERBE STP 'µ' pour arreter ");
		input = sc.nextLine();
		
		while(!input.equals("µ")) {
			conj.conjugueAvecSaisi(input);
			System.out.println("ENTRE UN VERBE STP 'µ' pour arreter ");
			input = sc.nextLine();
		}
		System.out.println("TA FINI MEK");
	}

}
