/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		atm();
	}
	
	public static void atm(){
	    Scanner scan = new Scanner(System.in);
	    int draw = scan.nextInt();
	    Double balance = scan.nextDouble();
	    if(draw % 5.0 == 0 && draw+0.50 <= balance)balance -= draw + 0.50;
        System.out.printf("%.2f",balance);
	}
}
