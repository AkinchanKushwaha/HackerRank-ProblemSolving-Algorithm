import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    // Complete the freqQuery function below.
	static List<Integer> freqQuery(List<int[]> queries) {
    	List<Integer> ans = new ArrayList<>();
    	Map<Integer, Integer> hm = new HashMap<>();
    	int n = queries.size();
    	
    	for(int i = 0 ; i<n ; i++) {
    		int operation = queries.get(i)[0];
    		int key = queries.get(i)[1];
    		
    		if(operation == 1) {
    			if(!hm.containsKey(key)) {
    				hm.put(key, 1);
    			}else hm.put(key, hm.get(key)+1);
    		}
    		
    		else if(operation== 2) {
    			if(hm.containsKey(key)) {
    				if(hm.get(key) <= 1) {
    					hm.remove(key);
    				}else hm.put(key, hm.get(key)-1);
    			}
    		}
    		
    		else if(operation == 3) {
    			if(hm.containsValue(key)) {
    				ans.add(1);
    			}else ans.add(0);
    		}
    	}
    	return ans;

    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
          int q = Integer.parseInt(bufferedReader.readLine().trim());
          List<int[]> queries = new ArrayList<>(q);
          Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
          for (int i = 0; i < q; i++) {
            int[] query = new int[2];
            Matcher m = p.matcher(bufferedReader.readLine());
            if (m.matches()) {
              query[0] = Integer.parseInt(m.group(1));
              query[1] = Integer.parseInt(m.group(2));
              queries.add(query);
            }
          }
          List<Integer> ans = freqQuery(queries);
          try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
            bufferedWriter.write(
                    ans.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n");
          }
        }
      }
}
