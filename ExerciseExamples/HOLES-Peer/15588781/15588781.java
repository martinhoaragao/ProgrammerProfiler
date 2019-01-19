
import java.util.*;
import java.lang.*;
import java.io.*;

class test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(System.out);
		
		int tc= Integer.parseInt(br.readLine());
		int holes, i, len;
		char c;
		String s;
		while(tc-->0)
		{
			s= br.readLine().trim();
			len=s.length();
			holes=0;
			for(i=0; i<len; i++)
			{
				c=s.charAt(i);
				if(c=='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
				holes+=1;
				else if(c=='B')
				holes+=2;
			}
			out.println(holes);
			out.flush();
		}
	}
}