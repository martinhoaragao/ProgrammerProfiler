/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			int a1[]=new int[26];
			for(int i=0;i<s.length();i++)
			a1[s.charAt(i)-'A']++;
			/**for(int i=0;i<26;i++)
			System.out.print(a1[i]+" ");**/
			int c=0;
			for(int i=0;i<26;i++)
			{
				if(i==0||i==3||i==14||i==15||i==16||i==17)
				{
					if(a1[i]>0)
					c+=a1[i];
				}
				else if(i==1&&a1[i]>0)
				c+=(a1[i]*2);
			}
			System.out.println(c);
		}
	}
}