package Test;

import java.util.ArrayList;
import java.util.List;

/*
En este kata, creará una función que toma una lista de enteros y cadenas no negativos 
y devuelve una nueva lista con las cadenas filtradas.
*/
 

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
	  List<Object> aux = new ArrayList<Object>();
	  for(Object i: list) {
		  if(!(i instanceof String)) {
			  aux.add(i);
		  }
	  }
    return aux;
  }
}
