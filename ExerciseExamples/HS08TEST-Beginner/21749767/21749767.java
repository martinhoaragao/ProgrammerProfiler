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
	    int withdraw = sc.nextInt();
	    double balance = sc.nextDouble();
	        if(withdraw % 5 != 0){
	            System.out.println(balance);
	        } else if (balance -withdraw-0.50>0){
                System.out.println(balance -withdraw-0.50);
	        } else{
	            System.out.println(balance);
	        }
	}
}
