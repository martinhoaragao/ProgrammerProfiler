/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str,str1;
		int n,l;
		String arr[] = new String[t];
		for(int z=0;z<t;z++)
		{
		    str = br.readLine();
		    l=str.length();
		    n = ((int)(str.charAt((l-1)))-48);
		    if(n%2!=0)
		    {
		        char c[] = new char[l];
		        c[l-1]=(char)(n-1+48);
		        str1 = str.substring(0,l-1)+Character.toString(c[l-1]);
		        arr[z]=str1;
		    }
		    else
		    arr[z] = str;
		}
		for(int z = 0;z<t;z++)
		System.out.println(arr[z]);
	}
}
