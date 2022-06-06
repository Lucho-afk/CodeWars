package Test;

public class Solution{
  public static String doubleChar(String s){
	  String respuesta= "";
	  for (char c : s.toCharArray()) {
		  respuesta= respuesta+c+c;
	  }
	  
	  
    return respuesta;
  }
}