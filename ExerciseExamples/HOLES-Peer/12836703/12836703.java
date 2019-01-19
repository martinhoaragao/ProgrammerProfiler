import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t;
	t = sc.nextInt();
	while(t>0)
	{
	 String A;
	 A=sc.next();
	 int n,i,c=0;
	 n=A.length();
	 for(i=0;i<n;i++)
	 {
		 char ch = A.charAt(i);
		 if(ch=='B')
			 c=c+2;
		 else if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
		 c=c+1;
	 }
	 System.out.println(c);
	 t--;
	 }
	}
}