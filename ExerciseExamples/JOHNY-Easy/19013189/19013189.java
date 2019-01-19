/* package codechef; // don't place package name! */
 
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc= new Scanner(System.in);
     int t= sc.nextInt();
     while(t>0){
         t--;
         int n=sc.nextInt();
         long a[]=new long[n];
         int i;
         for(i=0;i<n;i++)
         a[i]=sc.nextLong();
         int k=sc.nextInt();
         long l=a[k-1];
         Arrays.sort(a);
         for(i=0;i<n;i++)
         if(a[i]==l)
         break;
         System.out.println(i+1);
         
     }
	
	} 
	}
