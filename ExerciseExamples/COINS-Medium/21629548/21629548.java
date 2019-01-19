
/*
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Deque;

import java.util.LinkedList;*/
//import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;

public class Main {

	public static long[] dp = new long[1000000];

	public static long max(long a, long b) {

		/*
		 * if (a >= b && a >= c && a >= d) return a; if (b >= a && b >= c && b >= d)
		 * return b; else if (c >= a && c >= b && c >= d) return c; else return d;
		 */
		if (a >= b)
			return a;
		else
			return b;

	}

	public static void dd(long n) {

		n = 1000000 - 1;
		dp[0]=0;
		for (int i = 1; i <= n; i++) {

			dp[i] = Math.max(i, dp[i / 2] + dp[i / 3] + dp[i / 4]);
		}

	}
   public static long user(long n) {
	   if(n==0)
		   return 0;
	   else if(n<=1000000 && dp[(int)n]!=0)
		   return  dp[(int)n];
	   else
		   return Math.max(n, user(n/2)+user(n/3)+user(n/4));
	   
	   
	   
   }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		//StringTokenizer st = new StringTokenizer(br.readLine());
		dd(1000000);
		while (t-- > 0) {
			long n;
			try {
			 n= Long.parseLong(br.readLine());
			}
			catch(Exception e) {
				break;
			}
			//System.out.println(Math.max(n, con(n)));
			System.out.println(user(n));
			//n = Long.parseLong(br.readLine());
		}

	}
}