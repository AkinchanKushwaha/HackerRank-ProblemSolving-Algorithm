import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	int len = s.length();
    	int count = 0;
    	
    	for(char c : s.toCharArray()) {
    		if(c == 'a')
    			count++;
    	}
    	long a = n%len;
    	long remaining = 0;
    	for(int i = 0 ; i<a ; i++) {
    		if(s.charAt(i) == 'a') {
    			remaining++;
    		}
    	}
    	
    	return count*(n/len) + remaining;
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
