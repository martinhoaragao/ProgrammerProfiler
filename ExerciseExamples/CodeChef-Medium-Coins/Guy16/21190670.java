/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static HashMap<Long, Long> hs = new HashMap<>();
    
    public static long calc(long n){
        if(hs.containsKey(n)){
            // System.out.println("enter");
            return hs.get(n);
            
        }
        long sum = n/2 + n/3 + n/4;
        if(sum > n){
            hs.put(n,calc(n/2) + calc(n/3) + calc(n/4));
		    return calc(n/2) + calc(n/3) + calc(n/4);
            
        }
		else{
		    hs.put(n,n);
		    return n;
		    
		}
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		while(t-->0){
		    long n = Long.parseLong(br.readLine());
		    System.out.println(calc(n));
		  //  System.out.println(hs);
		}
	}
}
