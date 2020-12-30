import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndArray {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        
    	int [] sumFromStart = new int [arr.size()+1];
    	int [] sumFromEnd = new int[arr.size()+1];
    	
    	sumFromStart[0] = arr.get(0);
    	sumFromEnd[arr.size()-1] = arr.get(arr.size()-1);
    	
    	for(int i = 1 ; i<arr.size(); i++) {
    		sumFromStart[i] = arr.get(i)+sumFromStart[i-1];
    	}
    	
    	for(int i = arr.size()-2; i>=0; i--) {
    		sumFromEnd[i] = arr.get(i)+sumFromEnd[i+1];
    	}
    	
    	
    	for(int i = 0; i<arr.size(); i++) {
    		if(sumFromStart[i] == sumFromEnd[i]) {
    			return "YES";
    		}
    	}
    	return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr.add(arrItem);
            }

            String result = balancedSums(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
