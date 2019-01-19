/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		Main c = new Main();
		float val = c.balancePrint(x,y);
		System.out.printf("%.2f", val);
	}
	
	private float balancePrint(float x, float y){
	    if(x > y) return y;
	    if((x+0.50f) > y) return y;
	    if(x%5 != 0) return y;
	    return y-(x+0.50f);
	}
}