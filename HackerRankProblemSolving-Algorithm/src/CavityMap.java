import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CavityMap {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	int n = grid.length;
    	for(int i =1 ; i<n-1 ; i++) {
    		
    		StringBuilder s =  new StringBuilder(grid[i]);
    		for(int j = 1; j<n-1; j++) {
    			
    			int left = Character.getNumericValue(grid[i].charAt(j-1));
    			int right = Character.getNumericValue(grid[i].charAt(j+1));
    			int upper = Character.getNumericValue(grid[i-1].charAt(j));
    			int lower = Character.getNumericValue(grid[i+1].charAt(j));
    			
    			int curr = Character.getNumericValue(grid[i].charAt(j));
    			if(left < curr && right < curr && upper< curr && lower < curr) {
    				s.setCharAt(j, 'X');
    			}
    			grid[i] = s.toString();
    		}
    	}
    	return grid;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
