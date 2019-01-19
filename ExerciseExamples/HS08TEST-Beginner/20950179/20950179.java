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
	//System.out.println("Please enter the amount the you want to withdrawn:");
	int withAmount= in.nextInt();
	
	//System.out.println("The Amont you want to withdrwa is =" + withAmount);
	
    //System.out.println("Enter the Total Amount:");
    
    float totalAmount= in.nextFloat();
    
    
	//System.out.println("Total Amount is :"+totalAmount);
	
	
	if(withAmount+0.5 <= totalAmount && withAmount%5==0)
	{
	    totalAmount = totalAmount- (withAmount+0.50f);
	 	System.out.printf( "%.2f", totalAmount);
	}
	else
	
	//System.out.println("Please enter the valid amount in multiple of 5 and less the your account balanace:"+ totalAmount);
    
	System.out.printf( "%.2f", totalAmount);
	
	
	}
}
