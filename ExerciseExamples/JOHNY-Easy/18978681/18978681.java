/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan= new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n=scan.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]= scan.nextInt();
	            
	        }
	        int k=scan.nextInt();
	        int new_position=0;
	        for(int j=0;j<n;j++){
	            if(arr[j]<arr[k-1])
	                new_position++;
	        }
	        System.out.println(new_position+1);
	    }
	
	}
}
