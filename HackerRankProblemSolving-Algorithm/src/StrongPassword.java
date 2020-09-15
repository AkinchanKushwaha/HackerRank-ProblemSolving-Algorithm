import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	int c = 0, u = 0, l = 0, s = 0;
    	int count = 0;
    	for(int i = 0 ; i<n ; i++) {
    		char ch = password.charAt(i);
    		if(Character.isUpperCase(ch)) {
    			u++;
    		}else if(Character.isLowerCase(ch)) {
    			l++;
    		}else if(ch>=33 && ch<47) {
    			s++;
    		}else if(Character.isDigit(ch)) {
    			c++;
    		}
    		
    	}
    	if(l==0) {
			count++;
		}
		if(s==0) {
			count++;
		}
		if(u==0) {
			count++;
		}
		if(c==0) {
			count++;
		}
		return Math.max(count, 6-n);
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

