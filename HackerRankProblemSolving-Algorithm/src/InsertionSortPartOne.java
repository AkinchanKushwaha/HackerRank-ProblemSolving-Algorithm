
import java.util.Scanner;

public class InsertionSortPartOne {

    // Complete the insertionSort1 function below.
	   static void insertionSort1(int n, int[] arr) {
           int temp = arr[n-1];
           int i = n-2;
	       while(i >=0 && temp<arr[i]){
	    	   arr[i+1] = arr[i];
	           for(int d:arr)
	        	   	System.out.print(d + " ");
	            	System.out.println();
	            	i--;
	        	}
	       arr[i+1] = temp;
	       for(int d:arr)
	    	   System.out.print(d + " ");

   }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}

