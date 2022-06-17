package Test;
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      
      String respuesta= "";
      for(int i=0; i<repeat; i++){
        respuesta=respuesta+string;
      }
      return respuesta;
    }
}
