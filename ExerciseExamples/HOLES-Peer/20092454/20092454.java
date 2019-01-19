/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int in[]=new int[26];
	static int a[]=new int[26];
	static
	{
		a[0]=a[3]=a[14]=a[15]=a[16]=a[17]=1;
		a[1]=2;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n-->0)
		{
			char ch[]=br.readLine().toCharArray();
			flushArray();
			createArray(ch);
			System.out.println(generateOutput());
		}
	}
	public static void flushArray()
	{
		for(int i=0;i<26;i++)
		in[i]=0;
	}
	public static void createArray(char [] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			in[ch[i]-65]++;
		}
	}
	public static int generateOutput()
	{
		int sum=0;
		for(int i=0;i<26;i++)
		sum+=(a[i]*in[i]);
		return sum;
	}
}