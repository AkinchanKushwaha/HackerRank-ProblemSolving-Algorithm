
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
	  static String encryption(String s) {
	        String noSpaces = s.replaceAll(" ","");
	        int L = noSpaces.length();
	        
	        int upper = (int)Math.ceil(Math.sqrt(L));
	        int Lower = (int)Math.floor(Math.sqrt(L));
	        
	        StringBuffer result = new StringBuffer();
	        
	        for(int i = 0 ; i<upper; i++) {
	        	for(int j = i ; j<L ; j+=upper) {
	        		result.append(noSpaces.charAt(j));
	        	}result.append(' ');
	        }
	        return result.toString();
	    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
