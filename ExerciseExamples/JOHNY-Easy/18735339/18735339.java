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
		int n,m;
		Scanner o1=new Scanner(System.in);
		n=o1.nextInt();
		for(int i=0;i<n;i++)
		{
		    m=o1.nextInt();
		    ArrayList<Integer> arr=new ArrayList<Integer>();
		    for(int j=0;j<m;j++)
		    {
		        arr.add(o1.nextInt());
		    }
		    int check=o1.nextInt();
		    m=arr.get(check-1);
		    Collections.sort(arr);
		    
		    check=arr.indexOf(m);
		    System.out.println(check+1);
		}
	}
}
