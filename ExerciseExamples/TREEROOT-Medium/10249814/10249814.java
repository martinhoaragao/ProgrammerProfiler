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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int p=0;p<T;p++)
		{
		
		    
		int N = Integer.parseInt(br.readLine());
		
		
		    int sumid =0;
		  int node=-1;
		 int childid =0;
		  for(int i=0;i<N;i++)
		  {
		    String line = br.readLine();
		    String[] h = line.split(" ");
		    int a = Integer.parseInt(h[1]);
		    int b = Integer.parseInt(h[0]);
		    
		      sumid = sumid + b;
		      childid = childid + a;
		      
		  } 
		  node = sumid - childid;
		    out.write(Integer.toString(node));
		    out.newLine();
		}
		out.flush();
	}
}
