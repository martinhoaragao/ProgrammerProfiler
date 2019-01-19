/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();  
		for(int i=0;i<t;i++){
		    String s=in.next();
		    int count=0;
		    int c[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		    for(int j=0;j<s.length();j++)
		    count+=c[s.charAt(j)-65];
		
		System.out.println(count);}
	}
}
