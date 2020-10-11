import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheLoveLetterMystery {

    // Complete the theLoveLetterMystery function below.
	 static int theLoveLetterMystery(String s) {
	    	int n = s.length()/2;
	    	int count = 0;
	    	for(int i = 0 ; i<=n ; i++) {
	    		int j = s.length()-i-1;
	    		
	    		int a = s.charAt(i);
	    		int b = s.charAt(j);
	    		if(a!=b) {
	    			
	    			if(a>b) {
	    				count+=s.charAt(i)-s.charAt(j);
	    			}else count+=s.charAt(j)-s.charAt(i);
	    			
	    		}
	    	}
	    	return count;
	    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
