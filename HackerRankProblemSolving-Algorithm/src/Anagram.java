import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {

    // Complete the anagram function below.
    static int anagram(String s) {
    	int n = s.length()/2;
    	if(s.length()%2 != 0) {
    		return -1;
    	}
    	int [] ch = new int[26];
    	Arrays.fill(ch,0);
    	String a = s.substring(0, s.length()/2);
    	String b = s.substring(s.length()/2, s.length());
    	
    	for(int i = 0 ; i<ch.length ; i++) {
    		ch[a.charAt(i)-'a']++;
    	}
    	
    	for(int i = 0 ; i<b.length(); i++) {
    		if(ch[b.charAt(i)-'a']>0) {
    			ch[b.charAt(i)-'a']--;
    		}
    	}
    	int count = 0 ;
    	for(int i = 0 ; i<ch.length;i++) {
    		count+=ch[i];
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
