/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int ar[]=new int[26];
		ar[0]=1;
		ar[1]=2;
		ar[3]=1;
		ar[14]=1;
		ar[15]=1;
		ar[16]=1;
		ar[17]=1;
		for(int iis=0;iis<t;iis++){
			String s=br.readLine();
			int res=0;
			for(int i=0;i<s.length();i++){
				int index=(int)s.charAt(i)-65;
				res=res+ar[index];
			}
			System.out.println(res);
		}
	}
}