
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BearAndSteadyGene {

    // Complete the steadyGene function below.
    static int steadyGene(String gene) {
    	Map<Character, Integer> hm = new HashMap<>();
    	
    	int n = gene.length();
    	
    	int i = 0;
    	int j = n-1;
    	
    	while(j >= i) {
    		
    		if(hm.get(gene.charAt(j)) == n/4) {
    			j++;
    			break;
    		}
    		hm.put(gene.charAt(j), hm.get(gene.charAt(j))+1);
    		j--;
    	}
    	
    	if(j<0) return 0;
    	
    	int minLen = j;
    	
    	while(j<n) {
    		hm.put(gene.charAt(i), hm.get(gene.charAt(i))+1);
    		
    		while( j<n && hm.get(gene.charAt(i)) > n/4) {
    			hm.put(gene.charAt(j), hm.get(gene.charAt(j))-1);
    			j++;
    		}
    		int len = j-i-1;
    		minLen = Math.min(minLen, len);
    		i++;	
    	}
    	return minLen;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String gene = scanner.nextLine();

        int result = steadyGene(gene);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
