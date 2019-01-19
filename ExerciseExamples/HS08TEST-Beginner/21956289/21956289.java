/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    double a = s.nextDouble();
	    double b = s.nextDouble();
	    //double c;
  if(b>a+0.5){
    if(a%5==0)
    {
    b=b-a-0.5;
   
    System.out.printf("%.2f",b);
    }
    else
    {
   System.out.printf("%.2f",b);
    }
    }
    else
    {
        System.out.printf("%.2f",b);
    }
	}
}
