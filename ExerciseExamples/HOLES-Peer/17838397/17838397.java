/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    String s=input.next();
		    int holes=0;
		    for(int i=0;i<s.length();i++){
		        char ch=s.charAt(i);
		        if(ch=='A'||ch=='O'||ch=='D'||ch=='P'||ch=='Q'||ch=='R'){
		            holes++;
		        }
		        else if(ch=='B')
		          holes+=2;
		    }
		    System.out.println(holes);
		}
	}
}
