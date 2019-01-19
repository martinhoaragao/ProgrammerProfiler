import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=0;
	    t=sc.nextInt();
	    int i=0,a=0,b=0;
	    int x,y,p;
	    while(t!=0)
	    {
	        int n;
	        
	        n=sc.nextInt();
	     
	        int[] ar = new int[n];
	        for(i=0;i<n;i++)
	            ar[i]=sc.nextInt();
	       
	        x=sc.nextInt();
	        int u=ar[x-1];
	       
	       
	       for(a=0;a<n-1;a++)
	       {
	           for(b=0;b<n-a-1;b++)
	           {
	               if(ar[b]>ar[b+1])
	               {
	                
	               int temp=ar[b];
	               ar[b]=ar[b+1];
	               ar[b+1]=temp;
	               }
	           }
	       }
	       for(i=0;i<n;i++)
	       {
	           if(u==ar[i])
	            System.out.println(i+1);
	       }
	       
	       t=t-1;
	      
	    }
    

	    
	}
}
