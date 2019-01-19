/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t,n,i,pos,temp;
		t=in.nextInt();
		while(t!=0)
		{
		    t--;
		    n=in.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;++i)
		        a[i]=in.nextInt();
		    pos=in.nextInt();
		    temp=a[pos-1];
		    Arrays.sort(a);
		    for(i=0;i<n;++i)
		    {
		        if(temp==a[i])
		        {
		            pos=i+1;
		            break;
		        }
		    }
		    System.out.println(pos);
		}
	}
}
