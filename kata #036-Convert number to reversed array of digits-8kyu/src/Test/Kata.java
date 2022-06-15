package Test;

public class Kata {
	public static int[] digitize(long n) {
		String lista = n + "";
		int[] aux= new int[lista.length()];
		int[] aux2= new int[lista.length()];
		int h=0;
		int p=aux.length-1;
		for(char i: lista.toCharArray()) {
			aux[h]=Integer.parseInt(i+"");
			h++;
		}
		
		for(int j=0; j<aux.length; j++) {
			System.out.println(aux[p]);
			aux2[j]=aux[p];
			p--;
		}
		
		return aux2;
	}
}