package Test;

/*
Complete the solution so that the function will break up camel casing, using a space between words.
*/

class Solution {
	public static String camelCase(String input) {
		String resolucion = "";
		for (char i : input.toCharArray()) {
			resolucion=(Character.isUpperCase(i))?resolucion + " " + i:resolucion + i;
		}
		return resolucion;
	}
}