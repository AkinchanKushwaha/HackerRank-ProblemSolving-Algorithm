import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        
        String ans = "";
        Stack<Character> st = new Stack<>();
        
        for(int i= 0 ; i<s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else if(st.peek() == s.charAt(i)) {
                st.pop();
            }else st.push(s.charAt(i));
        }
        if(st.isEmpty()) {
            return "Empty String";
        }
        
        while(!st.isEmpty()) {
            ans += st.peek();
            st.pop();
        }
        StringBuffer sbf = new StringBuffer(ans);
        sbf.reverse();
        
        ans = sbf.toString();
        
      
        return ans;


}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
