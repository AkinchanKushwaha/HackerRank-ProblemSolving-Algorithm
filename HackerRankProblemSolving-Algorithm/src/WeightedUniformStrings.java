import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
    	String[] ans = new String[queries.length];
    	
    	HashSet<Integer> hs = new HashSet<>();
    	hs.add(s.charAt(0)-96);
    	int j = 1;
    	for(int i= 1 ; i<s.length(); i++) {
    		if(s.charAt(i-1) == s.charAt(i)) {
    			j++;
    			hs.add((s.charAt(i)-96)*j);
    		}else {
    			j=1;
    			hs.add((int)s.charAt(i)-96);
    		}
    	}
    	
    	for(int i = 0 ; i<queries.length; i++) {
    		if(hs.contains(queries[i])) {
    			ans[i] = "Yes";
    		}else {
    			ans[i] = "No";
    		}
    	}
    	
    	return ans;
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
