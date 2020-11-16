import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[]L = new int[n];
		int[]T = new int[n];
		
		int totalLuck = 0;
		List<Integer> important = new ArrayList<>();
		for(int i = 0 ; i<n ; i++) {
			L[i] = sc.nextInt();
			T[i] = sc.nextInt();
			totalLuck+=L[i];
			
			if(T[i] == 1) {
				important.add(L[i]);
			}
		}
		
		Collections.sort(important);
		
		int j = important.size() - k;
		
		int luckToRemove = 0;
		
		for(int i = 0 ; i<j; i++) {
			luckToRemove += important.get(i);
		}
		
		int result = totalLuck - (luckToRemove*2);
		System.out.println(result);
		
	}
}
