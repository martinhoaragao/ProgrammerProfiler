/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 1024 * 2);
		PrintWriter out = new PrintWriter(System.out, true);
		
		int T= Integer.parseInt(br.readLine());
		
        for(int i=0;i<T;i++){
            int n= Integer.parseInt(br.readLine());
            out.println(n-n%2);
        }
	}
}
