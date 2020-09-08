
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
	  static String encryption(String s) 
	    {
	        String nospaces = s.replace(" ","");
	        int length = nospaces.length();
	        int row = (int)Math.floor(Math.sqrt(length));
	        int col = (int)Math.ceil(Math.sqrt(length));
	        
	        
	        StringBuilder result = new StringBuilder();
	        
	        for(int i=0;i<col;i++)
	        {
	            for(int j=i;j<length;j=j+col)
	            {
	                result.append(nospaces.charAt(j));
	            }
	            result.append(' ');
	        }
	        
	        
	        return result.toString();
	    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
