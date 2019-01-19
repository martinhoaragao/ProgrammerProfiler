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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{   int count=0;
		    String img=br.readLine();
		    int n=img.length();
		    for(int j=0;j<n;j++)
		    {
		        char x=img.charAt(j);
		        if(x=='B')
		        count=count+2;
		        else if(x == 'A' || x == 'D' || x == 'O' || x == 'P' || x == 'Q' || x == 'R' )
                count = count+1;
		    }
		    System.out.println(count);
		}
	}
}
