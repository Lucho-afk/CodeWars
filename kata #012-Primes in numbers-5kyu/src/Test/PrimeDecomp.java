package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */



public class PrimeDecomp {

	public static String factors(int n) {
		String respuetaFinal = "";
		List<Integer> lista = new ArrayList<>();
		for (int factor = 2; factor <= n; factor++) {
			while (n % factor == 0) {
				lista.add(factor);
				n = n / factor;
			}
		}
		Set<Integer> miSet = new TreeSet<Integer>(lista);
		Map<Integer, Integer> respuesta = new TreeMap<Integer, Integer>();
		for (int i : miSet) {
			respuesta.put(i, Collections.frequency(lista, i));
		}
		for (Integer j : respuesta.keySet()) {
			respuetaFinal = (respuesta.get(j) == 1) ? respuetaFinal + "(" + j + ")"
					: respuetaFinal + "(" + j + "**" + respuesta.get(j) + ")";
		}
		return respuetaFinal;
	}
}