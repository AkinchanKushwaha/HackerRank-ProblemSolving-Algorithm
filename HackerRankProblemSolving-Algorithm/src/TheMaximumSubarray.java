import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheMaximumSubarray {

    // Complete the maxSubarray function below.
    static int[] maxSubarray(int[] arr) {
    	int ans[] = new int[2];
    	int subsequence = 0;
    	int maxSum = arr[0];
    	int currentSum = maxSum;
    	
    	for(int i = 1; i<arr.length; i++) {
    		currentSum =Math.max(arr[i]+currentSum, arr[i]);
    		maxSum = Math.max(maxSum,currentSum);
    	}
    	
    	
    	int maxValue = Integer.MIN_VALUE;
    	for(int i = 0 ; i<arr.length; i++) {
    		if(arr[i]>0) {
    			subsequence+=arr[i];
    		}
    		maxValue = Math.max(arr[i], maxValue);
    	}
    	
    	if(subsequence == 0) subsequence = maxValue;
    	
    	ans[0] = maxSum;
    	ans[1] = subsequence;
    	
    	return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = maxSubarray(arr);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

