import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x;
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		while(t-- > 0)
		{
		     x=ob.nextInt();
		     if(x%2==1)x--;
		     System.out.println(x);
		}
	}
}
