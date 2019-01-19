/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    int n=0;
	    for(int i=0;i<t;i++){
	        n = s.nextInt();
	        if(n%2 == 0)
	            System.out.println(n);
	        else
	            System.out.println(n-1);
	    }
	}
}
