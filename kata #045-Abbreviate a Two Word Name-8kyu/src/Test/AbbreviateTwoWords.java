package Test;
import java.util.StringTokenizer;

public class AbbreviateTwoWords {

	public static String abbrevName(String name) {

		StringTokenizer stringTokenizer = new StringTokenizer(name);
		char[] respuesta = new char[2];
		int i = 0;
		while (stringTokenizer.hasMoreTokens()) {

			respuesta[i] = stringTokenizer.nextToken().toCharArray()[0];
			i++;

		}

		return String.format("%c.%c", respuesta[0], respuesta[1]).toUpperCase();
	}
}