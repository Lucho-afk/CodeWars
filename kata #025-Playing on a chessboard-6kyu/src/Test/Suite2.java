package Test;

public class Suite2 {

	public static String game(long n) {
		
		long acumulador =n*n;

		if(acumulador % 2 == 0) {
			return "["+acumulador/2+"]";
			
		}else {
			
			return "["+acumulador+", 2]";
		}
	
	}
}


