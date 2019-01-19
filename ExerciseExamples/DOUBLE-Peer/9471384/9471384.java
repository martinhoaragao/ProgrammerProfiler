/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfOutput = Integer.parseInt(br.readLine());
		String text = new String ();
		int[] eachOutput = new int[noOfOutput];
		//System.out.println(noOfOutput);
		
		for(int x=0; x<noOfOutput ; x++)
		{
			
			text = br.readLine();
			eachOutput[x] = 0;
		    int text1 = Integer.parseInt(text);
		    //int  c,fact = 1;
		    int halfText1 = 0;
		  
         
         //System.out.println(fact);
         if(text1%2!=0){
        	 halfText1 = (text1-1);
        	 
        	
        	 
         }else{
        	 halfText1=text1;
        	 
        	 
		      
         }
	    
		  eachOutput[x]= halfText1 ;
		      
		 
		   System.out.println(eachOutput[x]);
		      
		}
		
		
	}
}
