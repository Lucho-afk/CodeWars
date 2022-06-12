package Test;

import java.util.Collections;

public class FakeBinary {
    public static String fakeBin(String numberString) {
    	String respuesta= "";
    	for(char c: numberString.toCharArray()) {
    		respuesta= (Integer.parseInt(c+"")<5)? respuesta+"0":respuesta+"1";
    	}
    	
    	
    	return respuesta;
    }
}