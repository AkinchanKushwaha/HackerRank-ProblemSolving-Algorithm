import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Gemstones {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
    	int n = arr.length;
    	int count = 0 ;
    	HashSet<Character> hs = new HashSet<>();
    	int a[] = new int[26];
    	for(int i= 0  ; i<n ; i++) {
    		String s = arr[i];
    		for(int j = 0 ; j<s.length(); j++) {
    			if(!hs.contains(s.charAt(j))) {
    				hs.add(s.charAt(j));
    				a[s.charAt(j)-97]++;
    			}
    		}hs.clear();
    	}
    	
    	for(int i = 0 ;  i<a.length; i ++) {
    		if(a[i] >=arr.length) {
    			count++;
    		}
    	}
    	return count;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
