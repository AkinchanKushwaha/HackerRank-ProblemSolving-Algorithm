import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingSortTwo {

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
    	int count [] = new int[100];
    	
    	for(int i = 0 ; i<arr.length; i++) {
    		count[arr[i]]++;
    	}
    	int x = 0;
    	int ans[] = new int[arr.length];
    	for(int i = 0 ; i<100 ; i++) {
    		if(count[i]>0) {
    			for(int j = 0 ; j<count[i]; j++) {
    				ans[x]=i;
    				x++;
    			}
    		}
    	}
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

        int[] result = countingSort(arr);

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