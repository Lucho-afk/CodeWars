package Test;

/*
Escribe una función, persistence, que tome un parámetro positivo numy devuelva su persistencia multiplicativa, 
que es el número de veces que debes multiplicar los dígitos numhasta llegar a un solo dígito.

Por ejemplo (Entrada --> Salida) :

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
*/

class Persist {
	public static int persistence(long n) {
		String respuesta = n+"";
		if (respuesta.length()==1) {
			return 0;
		}
		int contador=0;
		int multiplicador=1;
		int j;
		boolean variable= true;
		while(variable) {
			for (char i: respuesta.toCharArray()) {
				j=Integer.parseInt(i+"");
				multiplicador=multiplicador*j;
				
			}
			contador++;
			respuesta=multiplicador+"";
			multiplicador=1;
			variable=(respuesta.length()==1)?false:true;
		}
		System.out.println(contador);
		return contador;
	}
}