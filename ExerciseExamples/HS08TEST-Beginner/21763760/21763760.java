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
		int n = sc.nextInt();
		double m = sc.nextDouble();
		double r = 0.5f;
		sc.close();
		if (n % 5 == 0 && n+r <= m) {
		    System.out.println(m-(n+r));
		}
		else {
		    System.out.println(m);
		}
	}
}

