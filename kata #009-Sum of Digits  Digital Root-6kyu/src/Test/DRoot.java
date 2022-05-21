package Test;

/*
 * Dado n, tome la suma de los dígitos de n. Si ese valor tiene más de un dígito, 
 * continúe reduciendo de esta manera hasta que se produzca un número de un solo dígito. 
 * La entrada será un número entero no negativo.
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