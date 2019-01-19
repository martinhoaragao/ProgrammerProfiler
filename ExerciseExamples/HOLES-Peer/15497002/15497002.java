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
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt(),c;
		while(q--!=0){
		    c=0;
		    String s=sc.next();
		    int n=s.length();
		    for(int i=0;i<n;i++){
		        char a=s.charAt(i);
		        if(a=='A'||a=='D'||a=='O'||a=='P'||a=='Q'||a=='R'){
		            c++;
		        }
		        else if(a=='B'){
		            c+=2;
		        }
		    }
		    System.out.println(c);
		}
	}
}

