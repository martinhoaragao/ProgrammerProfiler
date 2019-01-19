import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner d=new Scanner(System.in);
	
	int t,n,i,x;
    t=d.nextInt();
	while(t-->0)
	    {   
	        n=d.nextInt();int a[];
	        a=new int[n];
	        for(i=0;i<n;i++)
	            {
	                a[i]=d.nextInt();
	            }
	            
	        x=d.nextInt();
	        x=a[x-1];
	         Arrays.sort(a);
	        i=0;
	        while(x!=a[i])
	            i++;
	        
	   
	        System.out.println(i+1);
	       
	    }
	

	}
}
