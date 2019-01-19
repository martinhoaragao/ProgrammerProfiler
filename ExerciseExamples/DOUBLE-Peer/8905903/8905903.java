/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintStream out=new PrintStream(System.out);
        
        long T=Long.parseLong(br.readLine());
        long N;
        
        while(T-->0)
        {
            N=Long.parseLong(br.readLine());
            if(N%2==0)
            out.println(N);
            else
            out.println(N-1);
            
        }
        
        
        
	}
}


