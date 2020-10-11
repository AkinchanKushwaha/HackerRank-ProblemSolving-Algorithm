import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankInAString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
    	String hs = "hackerrank";
    	
    	Queue<Character> q = new LinkedList<>();
    	
    	for(int i = 0 ; i<hs.length(); i++) {
    		q.add(hs.charAt(i));
    	}
    	
    	for(int i = 0 ; i<s.length(); i++) {
    		if(q.isEmpty()) {
    			break;
    		}
    		if(q.peek()==s.charAt(i)) {
    			q.remove(s.charAt(i));
    		}
    	}
    	if(q.isEmpty()) {
    		return"YES";
    	}else return "NO";
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
