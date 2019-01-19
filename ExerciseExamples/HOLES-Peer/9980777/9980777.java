/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a = new Scanner(System.in);
		int t = a.nextInt();
		while(t>=0)
		{
			t--;
			int count=0;
			String str = a.nextLine();
			int len = str.length();
			int flag=0;int flag1=0;
			for(int j=0;j<len;j++)
			{
			flag1=2;
			if(str.charAt(j)=='A'||str.charAt(j)=='D'||str.charAt(j)=='O'||str.charAt(j)=='P'||str.charAt(j)=='Q'||str.charAt(j)=='R')
			{
				flag=1;
				count+=1;
			}else if(str.charAt(j)=='B')
			{
				flag=1;count+=2;
			}
			}
			if(flag==0 && flag1==2)
			System.out.println("0");
			else if(count!=0)
			System.out.println(count);
		}
	}
}