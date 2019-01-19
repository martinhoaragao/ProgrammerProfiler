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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,k,l,root = 0,test = Integer.parseInt(br.readLine());
		String[] nos;
		while(test-- > 0){
		    root = 0;
		    n = Integer.parseInt(br.readLine());
		    for(int i = 0;i < n;i++){
		        nos = br.readLine().split(" ");
		        k = Integer.parseInt(nos[0]);
		        l = Integer.parseInt(nos[1]);
		        root = root + (k - l);
		    }
		    System.out.println(root);
		}
	}
}
