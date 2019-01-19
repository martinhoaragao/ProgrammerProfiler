/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out, true);
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
		    int numNodes = Integer.parseInt(br.readLine());
		    int ids = 0;
		    int temp1, temp2;
		    String[] parts;
		    
		    for(int i = 0; i<numNodes; i++)
		    {
		         parts = br.readLine().split(" ");
		         temp1 = Integer.parseInt(parts[0]);
		         temp2 = Integer.parseInt(parts[1]);
		         
		         ids += (temp1 - temp2);
		    }
		    
		    pw.println(ids);
		}
	}
}
