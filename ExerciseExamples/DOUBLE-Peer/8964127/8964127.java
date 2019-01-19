/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	    int numOfTestCases= Integer.parseInt(r.readLine());
		while(numOfTestCases-->0)
		{
		    int num = Integer.parseInt(r.readLine());
		    if(num%2==0)
		        log.write(num+"\n");
		    else
		        log.write((num-1)+"\n");
		}
		log.flush();
	}
}
