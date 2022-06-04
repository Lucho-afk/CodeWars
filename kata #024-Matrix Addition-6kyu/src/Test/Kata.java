package Test;
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		int[][] aux= a;

		for(int i=0 ; i<a.length ; i++) {
			for(int j=0; j<a[i].length; j++) {
				aux[i][j]=aux[i][j]+b[i][j];
			}
		}
		return aux;
	}
}