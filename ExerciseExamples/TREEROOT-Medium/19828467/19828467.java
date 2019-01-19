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
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.next());
		while(t>0){
		    t--;
		    int u=Integer.parseInt(s.next());
		    int r=0;
		    while(u>0){
		        u--;
		        r+=s.nextInt()-s.nextInt();
		    }
		    System.out.println(r);
		}
	}
}
