package Test;

/*
 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. 
 * All words must have their first letter capitalized without spaces.  
 */

public class Solution {

	public static String camelCase(String str) {
		String[] s = str.split(" ");
		String respuesta = "";
		for (String i : s) {
			for (int j = 0; j < i.length(); j++) {
				if (j == 0) {
					respuesta = respuesta + Character.toUpperCase(i.charAt(j));
				} else {
					respuesta = respuesta + i.charAt(j);
				}
			}
		}
		return respuesta;
	}

}
