import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,sum,l,i;
		String s;
		char x;
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		while(t-- > 0)
		{
		     s=ob.next();
		     l=s.length();
		     sum=0;
		     for(i=0;i<l;i++)
		     {
		          x=s.charAt(i);
		          if(x=='A'||x=='D'||x=='O'||x=='P'||x=='Q'||x=='R')sum++;
		          if(x=='B')sum+=2;
		     }
		     System.out.println(sum);
		}
	}
}
