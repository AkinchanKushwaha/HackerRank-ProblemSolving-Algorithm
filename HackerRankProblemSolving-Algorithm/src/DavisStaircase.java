import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DavisStaircase {

    // Complete the stepPerms function below.
	static int stepPerms(int n) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		return stepPerms(n, hs);
	}
    static int stepPerms(int n, HashMap<Integer, Integer> hm) {
    	
    	if(hm.containsKey(n)) {
    		return hm.get(n);
    	}
    	
    	if(n <= 1) return 1;
    	if(n == 2) return 2;
    	if(n == 3) return 4;
    	
    	int sum = stepPerms(n-1, hm)+ stepPerms(n-2, hm)+stepPerms(n-3, hm);
    	hm.put(n, sum);
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
