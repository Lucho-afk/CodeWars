package Test;
public class Sequence{

  public static int[] reverse(int n){
    int[] respuesta= new int[n];
    int h=0;
	for(int i = n; i>=1 ; i--) {
    	respuesta[h]=i;
    			h++;
    }
    return respuesta;
  }

}