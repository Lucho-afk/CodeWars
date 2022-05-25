package Test;

public class Kata {
	public static String createPhoneNumber(int[] numbers) {
		String respuesta = "";
		// "(123) 456-7890"
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				respuesta = respuesta + "(" + numbers[i];
			} else if (i == 2) {
				respuesta = respuesta + numbers[i] + ") ";
			} else if (i == 5) {
				respuesta = respuesta + numbers[i] + "-";
			} else {
				respuesta = respuesta + numbers[i];
			}
		}
		
		System.out.println(respuesta);
		return respuesta;
	}
}