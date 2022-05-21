package Test;

import java.util.HashMap;
import java.util.Map;

/*
El �cido desoxirribonucleico (ADN) es una sustancia qu�mica que se encuentra en el n�cleo de las c�lulas 
y lleva las "instrucciones" para el desarrollo y funcionamiento de los organismos vivos.
En las cadenas de ADN, los s�mbolos "A" y "T" son complementarios entre s�, como "C" y "G". 
Su funci�n recibe un lado del ADN (cadena, excepto Haskell); necesitas devolver el otro lado complementario. 
La hebra de ADN nunca est� vac�a o no hay ADN en absoluto (de nuevo, a excepci�n de Haskell).
*/

public class DnaStrand {
	public static String makeComplement(String dna) {

		Map<String, String> nombreMap = new HashMap<String, String>();
		nombreMap.put("A", "T");
		nombreMap.put("T", "A");
		nombreMap.put("C", "G");
		nombreMap.put("G", "C");
		String aux = "";
		for (int i = 0; i < dna.length(); i++) {
			aux = aux + nombreMap.get(dna.charAt(i) + "");
		}
		return aux;
	}
}