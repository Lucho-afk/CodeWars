package Test;

/*
Devuelve el número (recuento) de vocales en la cadena dada.

Consideraremos a, e, i, o, u como vocales para este Kata (pero no y).

La cadena de entrada solo constará de letras minúsculas y/o espacios.
*/

public class Vowels {

	public static int getCount(String str) {
		int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			switch (key) {
			case 'a':
				vowelsCount++;
				break;
			case 'e':
				vowelsCount++;
				break;
			case 'i':
				vowelsCount++;
				break;
			case 'o':
				vowelsCount++;
				break;
			case 'u':
				vowelsCount++;
				break;
			}
		}
		return vowelsCount;
	}

}