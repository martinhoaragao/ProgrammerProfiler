/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int t =in.nextInt();
	for(int i=0;i <t;i++)
	{int n =in.nextInt();List<Integer> f = new ArrayList<Integer>();
	for(int o=0; o<n;o++){f.add(in.nextInt());   }
	int k=in.nextInt();
	int d =f.get(k-1);
	Collections.sort(f);
	System.out.println(f.indexOf(d)+1);
	}
}}