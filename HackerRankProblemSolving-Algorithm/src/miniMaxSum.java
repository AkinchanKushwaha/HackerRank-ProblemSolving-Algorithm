
import java.util.Arrays;
import java.util.Scanner;

public class miniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	long sum = 0;
    	for(int i = 0 ; i< arr.length; i++) {
    		sum += arr[i];
    	}
    	System.out.print(sum-arr[(arr.length)-1]+" ");
    	System.out.print(sum-arr[0]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}


