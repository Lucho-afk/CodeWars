package Test;

/*
 Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer

*/

public class SquareDigit {

	public int squareDigits(int n) {
		String numeros = String.valueOf(n);
		String aux;
		String acumulador = "";
		for (int i = 0; i < numeros.length(); i++) {
			int numero = Character.getNumericValue(numeros.charAt(i));
			numero = numero * numero;
			aux = numero + "";
			acumulador = acumulador + aux;
		}

		return Integer.parseInt(acumulador);
	}

}