import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	int len1 = s.length();
    	int len2 = t.length();
    	int length = Math.min(len1, len2);
    	int commonLength = 0;
    	for(int i = 0 ; i<length ; i++) {
    		if(s.charAt(i)==t.charAt(i)) {
    			commonLength++;
    		}else
    			break;
    	}
    	
    	if(len1+len2 -(2*commonLength) > k) {
    		return "No";
    	}else if(((len1+len2)-(2*commonLength))%2 ==k%2) {
    		return"Yes";
    	}else if(len1 + len2-k <0) {
    		return  "Yes";
    	}else return "No";
    	
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

