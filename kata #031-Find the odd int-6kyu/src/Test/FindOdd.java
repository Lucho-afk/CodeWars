package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOdd {
	public static int findIt(int[] a) {

		if(a.length==0) {
			return 0;
		}
		List<Integer> numero = new ArrayList<>();
		for (int i : a) {
			numero.add(i);
		}
		Set<Integer> lista = new HashSet<Integer>(numero);
		for (Integer h : lista) {
			if (Collections.frequency(numero, h) % 2 == 1) {
				return h;
			}
		}
		return 1;
	}
}