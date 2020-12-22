import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RecursiveDigitSum {

    // Complete the superDigit function below.
    static long superDigit(String n, int k) {
    	Long sum = (long) 0;
    	
    	for(int i = 0 ; i<n.length(); i++) {
    		sum+= (int)n.charAt(i)-'0';
    	}
    	
    	sum = sum*k;
    	String s = String.valueOf(sum);
    	return superDigit(s);

    }
    
    static long superDigit(String n) {
    	if(n.length() == 1) return Long.parseLong(n);
    	Long sum = (long) 0;
    	for(int i = 0 ; i<n.length(); i++) {
    		sum+=(long)n.charAt(i)-'0';
    	}
    	return superDigit(String.valueOf(sum));
    }
    
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        long result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
