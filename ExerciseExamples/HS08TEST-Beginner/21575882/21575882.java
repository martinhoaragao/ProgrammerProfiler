/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes 
		
        Scanner sc = new Scanner(System.in);
        double tam= sc.nextDouble();
        double bal= sc.nextDouble();

        double nta = tam + 0.50;

        if(tam%5 == 0 && nta>0 && nta<bal){
            bal = bal-nta;
     
        }
        System.out.println(bal);
	}
}
