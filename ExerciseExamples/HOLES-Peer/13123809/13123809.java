import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long t,c;
            int i;
            Scanner sc=new Scanner(System.in);
            t=sc.nextLong();
            String s=new String();
            while(t!=0)
            {
                c=0;
                s=sc.next();
                for(i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='B')
                        c=c+2;
                    else if(s.charAt(i)=='A' || s.charAt(i)=='D' || s.charAt(i)=='O' || s.charAt(i)=='P' || s.charAt(i)=='Q' |s.charAt(i)=='R')
                        c++;
                }
                System.out.println(c);
                t--;
            }
	}
}
