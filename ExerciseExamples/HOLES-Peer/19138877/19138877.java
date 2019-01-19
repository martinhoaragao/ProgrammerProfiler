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
		int t=sc.nextInt();
		sc.nextLine();
		int[] arr={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		while(t-->0){
		    String s=sc.nextLine();
		    long ans=0;
		    for(int i=0;i<s.length();i++){
		        ans+=arr[s.charAt(i)-'A'];
		    }
		    System.out.println(ans);
		}
	}
}
