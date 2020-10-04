
import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
    	boolean isKaprekar = false;
    	for(long i = p ; i<=q; i++) {
			if(i == 1 || i==0) {
				System.out.print(i+" ");
			}
			else if(i*i>10) {
				String str = String.valueOf(i*i);
	    		int n = str.length();	    		
	    		Long a = Long.valueOf(str.substring(0,n/2));	    		
	    		Long b = Long.valueOf(str.substring(n/2,n));
	    		if(a+b == i && a != i ) {
	    			System.out.print(i+" ");
	    			isKaprekar = true;
	    		}
			}
    	}
    	if(!isKaprekar) System.out.print("INVALID RANGE");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
