/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static int N;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while ((T--) > 0 ){
		    N = sc.nextInt();
		    int X = 0;
		    for (int i = 0; i < N; ++i){
		        int id = sc.nextInt();
		        int c = sc.nextInt();
		        X += (id - c);
		    }
		    System.out.println(X);
		}
		sc.close();
	}
}
