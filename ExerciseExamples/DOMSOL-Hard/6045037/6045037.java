import java.io.*;
import java.util.*;

/*
  DO NOT REMOVE THIS COMMENT, OR THIS CODE WILL NOT WORK.
*/
class MyClass {
    
    public static void solve() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int t = Integer.parseInt(br.readLine());
		int t=1;
		StringBuilder sb = new StringBuilder("");
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a=new int[n+1];
			int[] b=new int[n+1];
			long[] dp=new long[n+1];
			String[] ip=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i+1]=Integer.parseInt(ip[i]);
			}
			ip=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				b[i+1]=Integer.parseInt(ip[i]);
			}
			dp[0] = 0;
			dp[1] = Math.abs(b[1]-a[1]);
			for(int i=2;i<=n;i++){
				long value1 = dp[i-1] + Math.abs(a[i]-b[i]);
				long value2 = dp[i-2] + Math.abs(a[i]-a[i-1]) + Math.abs(b[i]-b[i-1]);
				dp[i] = Math.max(value1, value2);
			}
			sb.append(dp[n]+"\n");
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) throws Exception{
        solve();
	} 
}