import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
 
class Factorization
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		while(t-->0)
        {
        	String a=in.next();
        	BigInteger n=new BigInteger(a);
        	BigInteger k=new BigInteger("2");
        	BigInteger zero=new BigInteger("0");
        	
       		if(n.remainder(k).compareTo(zero)==0)
        		System.out.println("2\n2 "+n.divide(k));
    		else
    			System.out.println("1\n"+n);
        }
	}
} 