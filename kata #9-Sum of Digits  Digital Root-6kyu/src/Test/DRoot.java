package Test;

/*
 * Dado n, tome la suma de los d�gitos de n. Si ese valor tiene m�s de un d�gito, 
 * contin�e reduciendo de esta manera hasta que se produzca un n�mero de un solo d�gito. 
 * La entrada ser� un n�mero entero no negativo.
 * 
 */

public class DRoot {
	public static int digital_root(int n) {
		int suma = 0;
		String numero = String.valueOf(n);
		boolean variable = true;
		for (char i : numero.toCharArray()) {
			suma = suma + Character.getNumericValue(i);
		}
		
		while (variable) {
			if (String.valueOf(suma).length() > 1) {
				String numero2 = String.valueOf(suma);
				suma=0;
				for (char j : numero2.toCharArray()) {
					suma = suma + Character.getNumericValue(j);
				}
			} else {
				variable = false;
			}
		}
		return suma;
	}
}