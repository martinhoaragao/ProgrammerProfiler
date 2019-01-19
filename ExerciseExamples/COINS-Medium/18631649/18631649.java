import java.io.*;
import java.util.*;

public class Main {
    static long[] dp;
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        dp = new long[100000001];
        while (in.hasNext()) {
            long n = in.nextLong();
            System.out.println(fun(n));
        }
    }
    static long fun(long n){
        if(n==0)
            return 0;
        if(n<=100000000) {
            if (dp[(int)n] != 0)
                return dp[(int)n];
            return dp[(int)n] = Math.max((long)n, fun(n / 2) + fun(n / 3) + fun(n / 4));
        }
        else
            return Math.max((long)n, fun(n / 2) + fun(n / 3) + fun(n / 4));
    }
}