package Test;

public class Printer {
    
    public static String printerError(String s) {
    	int error=0;
        for(char i: s.toCharArray()) {
        	if (!(i>96 && i<110)) {
        		error++;
        	}
        }
        return error +"/"+s.length();
    }
}