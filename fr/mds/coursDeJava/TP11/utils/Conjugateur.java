package fr.mds.coursDeJava.TP11.utils;

import java.util.ArrayList;
import java.util.List;

public class Conjugateur {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static List<String> verbes = new ArrayList();

	@SuppressWarnings("static-access")
	public Conjugateur() {
		this.verbes.add("parler");
		this.verbes.add("tirer");
		this.verbes.add("proutationner");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void conjugueAvecSaisi(String verbe) {
		List inputV = conjugue(verbe);
		inputV.forEach((item) -> System.out.println(item));
	}
	
	@SuppressWarnings("unchecked")
	public static void toutConjugue(){
		@SuppressWarnings("rawtypes")
		List<List> all = new ArrayList();
		for(int i = 0; i < verbes.size(); i++) {
			all.add(conjugue(verbes.get(i)));
		}
		all.forEach((item) -> item.forEach((i) -> System.out.println(i)));
	}
	
	@SuppressWarnings("rawtypes")
	public static List<String> conjugue(String verb) {
		@SuppressWarnings("unchecked")
		List<String> conjug = new ArrayList();
		for(int i = 0; i < 6; i++) {
			String courant = verb.substring(0, verb.length()-2);
			switch(i) {
				case 0: 
					courant = "je " + courant + "e";
					break;
				case 1: 
					courant = "tu " + courant + "es";
					break;
				case 2: 
					courant = "ils " + courant + "e";
					break;
				case 3: 
					courant = "nous " + courant + "ons";
					break;
				case 4: 
					courant = "vous " + courant + "ez";
					break;
				case 5: 
					courant = "ils " + courant + "ent";
					break;
			}
			conjug.add(courant);
;		}
		conjug.add("");
		return conjug;
	}
}
