import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner s=new Scanner(System.in);
	int T;
	String str;
	char ch;
	T=s.nextInt();
	while(T>0)
	{
	    int count=0;
	  str=s.next();
	    int len=str.length();
	    for(int i=0;i<len;i++)
	    {
	        ch=str.charAt(i);
	        if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
	        {
	            count++;
	        }
	        else
	        if(ch=='B')
	        {
	        count+=2;
	        }
	    }
	    System.out.println(count);
	    
	    T--;
	}
}
}
