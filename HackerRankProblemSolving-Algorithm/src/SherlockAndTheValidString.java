import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
    	int arr[] = new int[26];
    	
    	for(int i = 0 ; i<s.length(); i++) {
    		arr[s.charAt(i)-'a']++;
    	}
    	int prev = arr[0];
    	int x = 0;
    	for(int i = 1 ; i<arr.length; i++) {
    		if(arr[i] == 0) {
    			continue;
    		}
    		
    		if(arr[i] != prev && x<1) {
    			x++;
    			continue;
    		}
    		if(arr[i] != prev) {
    			return "NO";
    		}
    		prev = arr[i];
    		
    	}
    	return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
