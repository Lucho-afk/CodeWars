package Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SumParts {

	public static int[] sumParts(int[] ls) {

		int[] respuesta = new int[ls.length + 1];
		int acumulador = 0;
		List<Integer> lista = new ArrayList<Integer>();
		Collections.addAll(lista, Arrays.stream(ls).boxed().toArray(Integer[]::new));
		int numero = (int) lista.stream().reduce(0, (acumulator, element) -> acumulator + element);
		for (int i = ls.length; i > 0; i--) {
			respuesta[ls.length - i] = numero - acumulador;
			acumulador = acumulador + lista.get(0);
			lista = lista.subList(1, lista.size());
		}
		for (int j : respuesta) {
			System.out.println(j);
		}
		return respuesta;
	}
}
