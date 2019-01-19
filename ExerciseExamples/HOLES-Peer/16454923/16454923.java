/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in) ;
		
		
		int loop = sc.nextInt() ;
		sc.nextLine();
		for (int i = 0; i<loop ; i++ )
		{
		    String input = sc.nextLine() ;
		    int len = input.length() ;
		    int count=0;
		    for(int j = 0 ; j<len ; j++)
		    {
		        char work = input.charAt(j) ;
		        
		        if(work == 'A' ||work == 'D' ||work == 'O' ||work == 'P' ||work == 'Q' || work =='R' )
		        {
		            count++ ;
		        }
		        else if(work== 'B')
		        {
		            count = count + 2 ;
		        }
		    }
		    System.out.println(count);
		}
	}
}
