import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeIndex {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {

    	int n = s.length();
    	
    	for(int i = 0 ; i<n/2; i++) {
    		if(s.charAt(i) != s.charAt(n-i-1)) {
    			
    			if(isPal(s.substring(i, n-i-1))){
    				return n-i-1;
    			}else return i	;
    		}
    	}
    	return -1;
    }
    
    public static boolean isPal(String str) {
    	int len = str.length();

    	for (int i = 0; i < len / 2; i++) {
    		if (str.charAt(i) != str.charAt(len - i - 1)) {
    			return false;
    		}
    	}

    	return true;

    	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
