import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Coins {

	public static void main(String args[]) {
		long dp[] = new long[1000000];
		int len = dp.length;
		for(int i=0;i<12;i++)		dp[i] = i;
		
		for(int i=12;i<len;i++)
			dp[i] = dp[i/2] + dp[i/3] + dp[i/4];
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			long n = sc.nextInt();
			PriorityQueue<Long> que = new PriorityQueue<Long>(Collections.reverseOrder());
			que.add(n);
			
			long ans = 0;
			while(que.isEmpty() == false) {
				long rem = que.remove();
				if(rem < len) {
					ans += dp[(int)rem];
				}
				else {
					que.add(rem/4);
					que.add(rem/3);
					que.add(rem/2);
				}
			}
			System.out.println(ans);
		}
	}	
}
