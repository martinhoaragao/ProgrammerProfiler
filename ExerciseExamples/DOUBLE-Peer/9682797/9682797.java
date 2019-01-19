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
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    if(n%2!=0){
		        n--;
		    }
		    /*for(int i=0;i<S.length;i++){
		        
		        if(S[i]=='A'||S[i]=='D'||S[i]=='O'||S[i]=='P'||S[i]=='Q'||S[i]=='R'){
		            count++;
		        }
		        else if(S[i]=='B'){
		            count+=2;
		        }
		    }*/
		    System.out.println(n);
		}
	}
}
