import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
    	StringBuilder sb = new StringBuilder(s);
    	k = k%26;
    	for(int i = 0 ; i<s.length(); i++) {
    		char ch = sb.charAt(i);
    		if(Character.isLetter(ch)) {
    			if(Character.isUpperCase(ch)) {
    				if(ch+k>90) {
    					int a = 64+((ch+k)%90);
    					sb.setCharAt(i,(char)a);
    				}else {
    					sb.setCharAt(i,(char) (ch+k));
    				}
    			}else {
    				if(ch+k>122) {
    					int a = 96+((ch+k)%122);
    					sb.setCharAt(i,(char)a);
    				}else {
    					sb.setCharAt(i,(char) (ch+k));
    				}
    			}
    		}
    	}
    	
    	return sb.toString();
    	
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
