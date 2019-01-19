/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	int moneyDraw=	sc.nextInt();
	double moneyAvailable=sc.nextDouble();
	double result=0;
	if(moneyDraw%5==0 && moneyDraw+0.50<moneyAvailable){
	     result=moneyAvailable-(moneyDraw+0.50);
	    System.out.printf("%.2f",result);
	}else if(moneyDraw%5!=0 || moneyDraw+0.50>moneyAvailable){
	   System.out.print( moneyAvailable);
	}
	}
}
