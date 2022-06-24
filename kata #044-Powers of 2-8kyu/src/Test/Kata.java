package Test;

public class Kata {
	public static long[] powersOfTwo(int n) {
		long[] arreglo = new long[n+1];
		if (n != 0) {
			
			for (int i = 0; i <= n; i++) {

				arreglo[i] = (long) Math.pow(2, i);
				System.out.println(arreglo[i]);

			}
			
		} else {
			long[] arreglo2 = { 1 };
			return arreglo2;
		}
		return arreglo;
	}
}