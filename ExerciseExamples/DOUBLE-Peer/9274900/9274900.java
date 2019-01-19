/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());
		int palLen;
		int count;
    	for(int j=0; j<T; j++)	{
	        count=0;
	        palLen = Integer.parseInt(sc.nextLine());
           
           if(palLen%2==0)
            System.out.println(palLen);
            else
            System.out.println(palLen-1);
    	}	
	}
}
