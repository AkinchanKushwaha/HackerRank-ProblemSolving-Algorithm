import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GameOfThronesOne {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
    	int arr[] = new int[26];
    	
    	for(int i = 0 ; i<s.length(); i++) {
    		arr[s.charAt(i)-'a']++;
    	}
    		int count1 = 0;
    	for(int i = 0 ; i<26; i++) {
    		if(arr[i]%2!= 0 && count1 ==1) {
    			return "NO";
    		}
    		
    		if(arr[i]%2 !=0) {
    			count1++;
    		}
    		
    	}
    	return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
