
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

    public static long[] dp = new long[1000001];

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
        else if(n<=999999 && dp[(int)n]!=0)
            return  dp[(int)n];
        else
            return Math.max(n, user(n/2)+user(n/3)+user(n/4));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 10;
        dd(1000000);
        while (t-- > 0) {
            long n;
            try {
                n= Long.parseLong(br.readLine());
            }
            catch(Exception e) {
                break;
            }
            System.out.println(user(n));
        }
    }
}