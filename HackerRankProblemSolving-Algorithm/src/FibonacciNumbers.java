import java.util.HashMap;
import java.util.Scanner;

public class FibonacciNumbers {
	
	public static int fibonacci(int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		return fibonacci(n, hm);
	}

    public static int fibonacci(int n, HashMap<Integer, Integer>hm) {
        
    	if(hm.containsKey(n)) {
    		return hm.get(n);
    	}
    	
    	if(n == 0) return 0;
    	if(n <= 2) return 1;
    	
    	int num = fibonacci(n-1, hm)+fibonacci(n-2, hm);
    	
    	hm.put(n, num);
    	return num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}