package Test;
public class Kata
 {
  public static int squareSum(int[] n)
  { 
   int respuesta= 0;
     
     for(int i: n){
       respuesta = respuesta + (i*i); 
     }
    return respuesta;
  }
 }