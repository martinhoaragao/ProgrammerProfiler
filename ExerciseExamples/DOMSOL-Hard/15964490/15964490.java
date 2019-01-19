import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class GFG
 {  static int max(int a,int b){
     if(a>b)
     return a;
     return b;
 }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int[][] arr = new int[2][n];
	 for(int k=0;k<2;k++)
	     for(int i=0;i<n;i++)
	        arr[k][i] = s.nextInt();
	        
	       
	 int[] dp = new int[n];
	 dp[0] = Math.abs(arr[0][0]-arr[1][0]);
	 dp[1] = max(dp[0]+Math.abs(arr[0][1]-arr[1][1]),Math.abs(arr[0][1]-arr[0][0])+Math.abs(arr[1][1]-arr[1][0]));
	 for(int i=2;i<n;i++)
	     dp[i] = max(dp[i-1]+Math.abs(arr[0][i]-arr[1][i]),dp[i-2]+Math.abs(arr[0][i-1]-arr[0][i])+Math.abs(arr[1][i-1]-arr[1][i]));
	 
	    System.out.println(dp[n-1]+" ");
	 }
}