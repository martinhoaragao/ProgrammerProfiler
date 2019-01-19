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
		int wd = sc.nextInt();
		float initial = sc.nextFloat();
		
		if(wd + 0.50 > initial || (wd%5)!=0){
		    System.out.printf("%.2f",initial);
		}
		else{
		    System.out.printf("%.2f",initial - wd - 0.50);
		}
	}
}
