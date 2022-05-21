package Test;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class FindOutlier {
	static int find(int[] integers) {
		Vector<Integer> array = new Vector<>();
		for (int i : integers) {
			array.add(i);
		}
		List<Integer> lista = array.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList());
		return (lista.size() == 1) ? lista.get(0)
				: array.stream().filter(e -> (e % 2 != 0)).collect(Collectors.toList()).get(0);
	}
}