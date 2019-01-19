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
			long[] dp1=new long[n+1];
			long[] dp2=new long[n+1];
			String[] ip=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i+1]=Integer.parseInt(ip[i]);
			}
			ip=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				b[i+1]=Integer.parseInt(ip[i]);
			}
			dp1[0] = 0;
			dp2[0] = 0;
			dp1[1] = Math.abs(b[1]-a[1]);
			dp2[1] = dp1[1];
			//sb.append(String.format("dp1[%d] : %d , dp2[%d] : %d\n",1,dp1[1],1,dp2[1]));
			for(int i=2;i<=n;i++){
				dp1[i] = Math.max(dp1[i-1], dp2[i-1]) + Math.abs(a[i]-b[i]);
				//sb.append(String.format("a[%d]: %d, a[%d]: %d, b[%d]: %d, b[%d]: %d\n",i,a[i],i-1,a[i-1],i,b[i],i-1,b[i-1]));
				dp2[i] = Math.max(dp1[i-2], dp2[i-2]) + Math.abs(a[i]-a[i-1]) + Math.abs(b[i]-b[i-1]);
				//sb.append(String.format("dp1[%d] : %d , dp2[%d] : %d\n",i,dp1[i],i,dp2[i]));
			}
			long max = Math.max(dp1[n], dp2[n]);
			sb.append(max+"\n");
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) throws Exception{
        solve();
	} 
}