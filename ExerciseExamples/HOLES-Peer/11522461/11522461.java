/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    //dear patron god of code
	    //help me.
	BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
	int cases=Integer.parseInt((buf.readLine()).trim()), i, j, count=0;
	String[] parts;
	for(i=1; i<=cases; i++)
	{
	    parts=buf.readLine().trim().split("");
	    for(j=0;j<parts.length; j++)
	    {
	        if(parts[j].equals("B"))
	        count+=2;
	        else if(parts[j].equals("A") || parts[j].equals("D") || parts[j].equals("O") || parts[j].equals("P") || parts[j].equals("Q") || parts[j].equals("R"))
	        count++;
	    }
	    System.out.println(count);
	    count=0;
	}
	}
}
  