/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,c,d;
		
		Scanner s=new Scanner(System.in);
		d=s.nextInt();
		for(int i=0;i<d;i++){
		    a=s.nextInt();
		    int[] a1=new int[a];
		    for(int j=0;j<a;j++){
		        a1[j]=s.nextInt();
		    }
		    b=s.nextInt();
            int x=1;
		    c=a1[b-1];
		    Arrays.sort(a1);
		    for(int j=0;j<a;j++){
		        if(a1[j]==c)
		            break;
		        else 
		            x++;
		    }
		    System.out.println(x);
		}
	}
}
