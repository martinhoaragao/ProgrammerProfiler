/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
           public static HashMap<Long,Long> hm=new HashMap<Long,Long>();
	public static void main (String[] args) throws java.lang.Exception
	{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);
        String input;
        while ((input = br.readLine()) != null) {
        long t = Long.parseLong(input);
        //System.out.println("Number:" +t);
        long ans = find(t);
        System.out.println(ans);
       }
}
	
	private static long find(long num){
		if(hm.get(num) != null){
			//System.out.println("Found in map:" +num );
			return(hm.get(num));
		}
		long retVal = 0;
		//System.out.println("calling with input:" +num);
		if(num <= 4){
			//System.out.println("returning number:" +num);
			return num;
		}else{
			 //System.out.println("number:" +num);
			 retVal = max((find(num/2)) + find((num/3)) +find((num/4)),num);
		}
	 hm.put(num,retVal);
	 return retVal;
	}
	
	private static long max(long m,long n){
		if(m >= n){
			return m;
		}else{
			return n;
		}
	}
 }
