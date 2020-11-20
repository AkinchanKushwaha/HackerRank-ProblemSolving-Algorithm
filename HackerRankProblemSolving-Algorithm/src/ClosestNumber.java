import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumber {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
    	ArrayList<Integer> al = new ArrayList<>();
    	
    	Arrays.sort(arr);
    	int min = Integer.MAX_VALUE;
    	for(int i = 0 ; i<arr.length-1; i++) {
    		int currMin = Math.abs(arr[i]-arr[i+1]);
    		if(currMin<min) {
    			al.clear();
    			al.add(arr[i]);
    			al.add(arr[i+1]);
    			min = currMin;
    		}else if(currMin == min) {
    			al.add(arr[i]);
    			al.add(arr[i+1]);
    		}
    	}
    	int[] ans = al.stream().mapToInt(i -> i).toArray();
    	return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}