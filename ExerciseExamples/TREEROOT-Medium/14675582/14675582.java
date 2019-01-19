/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		
		int temp =t;
		
		while(temp-->0)
		{
		    int n = sc.nextInt();
		    int total=0;
		    int [] id = new int[n];
		    int [] sum = new int[n];
		    
		    for (int i =0;i<n;i++)
		    {
		       
		        id[i] = Integer.parseInt(sc.next());
		        sum[i] = Integer.parseInt(sc.next());
		     
		    }
		    
		    
		    for (int j =0;j<n;j++)
		    {
		        
		        total-=sum[j];
		    }
		    //System.out.println(total);
		    for (int j =0;j<n;j++)
		    {
		        //System.out.println(total);
		        total+=id[j];
		    }
		
		System.out.println(total);
		
		    
		}
		
		
		sc.close();
	}
}
