import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

      public static int getTotalX(List<Integer> a, List<Integer> b) {
    int count=0;
    int fin=0;
    int j=0;
    for(int i=a.get(a.size()-1);i<=b.get(0);i++){
        j=0;
        count=0;
        while(j<a.size()){
            if(i%a.get(j)==0){
                count++;
            }
            j++;
        }
        j=0;
        if(count==a.size()){
            count=0;
            while(j<b.size()){
                if(b.get(j)%i==0){
                    count++;
                }
                j++;
            }
            if(count==b.size())
            fin++;
        }
    }
    return fin;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
