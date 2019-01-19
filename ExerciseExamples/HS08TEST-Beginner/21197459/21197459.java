// Java program to demonstrate working of Scanner in Java 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

class Ideone
{
	public static void main (String[] args)
	{ 
	  
	  Scanner s = new Scanner(System.in);
      float withdrawAmount;
      float accountBalance;
      withdrawAmount=s.nextFloat();
      accountBalance= s.nextFloat();
      if(withdrawAmount % 5 == 0 && withdrawAmount+.50 <= accountBalance){
      	float remainingBalance = (float) (accountBalance - (withdrawAmount + 0.50));
      	System.out.printf("%.2f",remainingBalance );
      	
      }
      else 
      System.out.println(accountBalance);
	 
	
	}
}
