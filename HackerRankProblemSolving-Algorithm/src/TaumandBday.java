import java.util.Scanner;

public class TaumandBday { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            long B = scan.nextLong();
            long W = scan.nextLong();
            long Bc = scan.nextLong();
            long Wc = scan.nextLong();
            long Z = scan.nextLong();
          
            
            System.out.println(B * Math.min(Bc, Wc + Z) + W *Math.min(Wc, Bc + Z));
        }
        scan.close();
    }
}
