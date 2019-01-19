import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static long coins(long n)
    {
        long x=n/2+n/3+n/4;
        if(x>n) return coins(n/2)+coins(n/3)+coins(n/4);
        else
            return n;
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLong())
        {
		        long n=sc.nextLong();
                System.out.println(coins(n));
        }
	}
}