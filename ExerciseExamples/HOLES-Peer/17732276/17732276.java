/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
		    String s = sc.next();
		    int count = 0;
		    for(int i = 0; i<s.length(); i++)
		    {
		        char ch = s.charAt(i);
		        if(ch == 'A' || ch == 'D' || ch == 'P' || ch == 'R' || ch == 'O' || ch == 'Q')
		             count = count + 1;
		        else if (ch == 'B')
		             count = count + 2;
		    }
		    System.out.println(count);    
		    t--;
		}
    }
}    

