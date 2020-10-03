import java.util.Scanner;

public class ServiceLane {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int width[] = new int[n];
		for(int i = 0 ; i<n; i++) {
			width[i] = sc.nextInt();
		}
		while(t>0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int min = Integer.MAX_VALUE;
			for(int a = i ; a<=j ; a++) {
				min = Math.min(min, width[a]);
			}
			System.out.println(min);
			t--;
		}
		
	}
}
