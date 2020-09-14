
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	
//    	============O(n^2)============
//    	int result = Integer.MAX_VALUE;
//    	int min = 0;
//    	int n = a.length;
//    	for(int i = 0 ; i<n ; i++) {
//    		for(int j = i+1 ; j<n ; j++) {
//    			if(a[i] == a[j]) {
//    				min = Math.abs(j-i);
//    				result = Math.min(result, min);
//    			}
//    		}
//    	}
//    	
//    	if(result == Integer.MAX_VALUE) {
//    		return -1;
//    	}else return result;
 
    	
//    	============O(n)============    	
    	int result = Integer.MAX_VALUE;
    	int min = 0;
    	int n = a.length;
    	HashMap<Integer, Integer> hashmap = new HashMap<>();
    	for(int i= 0 ; i<n; i++) {
    		if(!hashmap.containsKey(a[i])) {
    			hashmap.put(a[i], i);
    		}else {
    			int x = hashmap.get(a[i]);
    			min = Math.abs(i-x);
    			result = Math.min(result, min);
    		}
    		
    	}
    	
    	if(result == Integer.MAX_VALUE) {
    		return -1;
    	}else return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

