package Test;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Mueva la primera letra de cada palabra al final de la misma, 
 * luego agregue "ay" al final de la palabra. Deje los signos de puntuación intactos.
 * 
 * */

public class PigLatin {
	public static String pigIt(String str) {
		String[] repuesta = str.split(" ");
		String palabras = "";
		List<String> rest = new ArrayList<>();
		String variable = "";
		for (String i : repuesta) {
			char[] palabra = i.toCharArray();
			if((palabra[0]>97 && palabra[0]<122)||(palabra[0]>64 && palabra[0]<91)) {
				for (int j = 1; j < i.length(); j++) {
					palabras = palabras + palabra[j];
				}
				palabras = palabras + palabra[0] + "ay";
				rest.add(palabras);
				palabras = "";
			}else {
				rest.add(i);
			}
		}
		for (String h : rest) {
			variable = (variable == "") ? variable + h : variable + " " + h;
		}
		return variable;
	}
}