/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter output = new BufferedWriter(new PrintWriter(System.out));
	    int cases = Integer.parseInt(console.readLine());
	    StringBuilder sb = new StringBuilder();
	    while(cases > 0)
	    {
	        int N = Integer.parseInt(console.readLine());
            if(N%2 == 0)
            {
                sb.append(N).append("\n");
            }
            else
            {
                sb.append(N-1).append("\n");
            }
            cases--;
	    }
	    output.append(sb.toString());
	    output.close();
	}
}