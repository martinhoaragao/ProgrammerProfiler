/* package codechef; // don't place package name! */

import java.io.*;
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=0;tc<T;tc++){
		    int N = s.nextInt();
		    int a=0;
		    int b=0;
		    for(int i=0;i<N;i++){
		        a = a + s.nextInt();
		        b = b + s.nextInt();
		    }
		    System.out.println(a-b);
		}
	}
}
