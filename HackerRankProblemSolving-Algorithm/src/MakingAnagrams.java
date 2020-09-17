import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
    	int count = 0;
    	int a[] = new int[256];
    	int b[] = new int[256];
	    
    	for(int i = 0 ; i<s1.length(); i++) {
    		a[s1.charAt(i)]++;
    	}
    	for(int i = 0  ; i<s2.length(); i++) {
    		b[s2.charAt(i)]++;
    	}
    	
    	for(int i = 0;  i<256; i++) {
    		if(a[i] < b[i]) {	
    			int x = b[i]-a[i];
    			count += x;
    		}else if(a[i]> b[i]) {
    			int x = a[i]-b[i];
    			count+= x;
    		}
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
