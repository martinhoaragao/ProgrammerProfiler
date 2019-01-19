/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
           int count =0;
           int N = sc.nextInt();
           if(N%2==0){
               System.out.println(N);
           }else{
               System.out.println(N-1);
           }
           t--;
        }
	}
}