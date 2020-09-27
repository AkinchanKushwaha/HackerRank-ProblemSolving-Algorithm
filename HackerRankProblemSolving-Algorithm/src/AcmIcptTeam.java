import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AcmIcptTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
    	ArrayList<Integer> sol = new ArrayList<>();
    	int count=0;
        for(int i=0;i<topic.length;i++){
            for(int j=i+1;j<topic.length;j++){
            	
                char[] a=topic[i].toCharArray();
                char[] b=topic[j].toCharArray();
                for(int k=0;k<a.length;k++){
                    if(a[k]=='1' || b[k]=='1')
                    count++;
                }
                sol.add(count);
                count=0;
            }            
        }
        Collections.sort(sol,Collections.reverseOrder());
        
        int[] ans=new int[2];
        ans[0]=sol.get(0);
        for(int i=0;i<sol.size();i++){
            if(sol.get(i)==ans[0])
            ans[1]++;
        }
        

        return ans;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
