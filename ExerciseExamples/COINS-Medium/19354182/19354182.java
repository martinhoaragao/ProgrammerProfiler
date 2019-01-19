/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
    static long calculate(long l){
        
        long l1,l2,l3,sum;
        
    		l1=l/2;
    		l2=l/3;
    		l3=l/4;
    		sum=l1+l2+l3;
    		if(sum>l)
    		{
    		    return calculate(l1)+calculate(l2)+calculate(l3);
    		}
    		    //call
    		else
    		    return l;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		long l=0;
		//long l1,l2,l3,sum;
		do{
    		l = sc.nextLong();
    		
    		
    		System.out.println(calculate(l));
    		
    		
		}while(sc.hasNextLong());
		
		
		
		
	}
}
