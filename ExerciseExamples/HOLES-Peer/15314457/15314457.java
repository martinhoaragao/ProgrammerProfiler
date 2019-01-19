/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		String a=new String();
		a=sc.next();
		int l=a.length();
		char b[]=new char[100];
		b=a.toCharArray();
		int count=0;
		for(int j=0;j<l;j++)
		{
		    switch(b[j]){
		        case 'A':count++;
		                break;
		        case 'B':count=count+2;
		                break;
		        case 'D':count++;
		                break;
		        case 'O':count++;
		                break;
		        case 'P':count++;
		                break;
		        case 'Q':count++;
		                break;
		        case 'R':count++;
		                break;
		    }
		 }
		    System.out.println(count);
		    
		}
		
		
		
	}}
	
