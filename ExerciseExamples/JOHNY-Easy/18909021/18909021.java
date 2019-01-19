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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n = sc.nextInt();
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        a.add(sc.nextInt());
		    }
		    int k = sc.nextInt();
		    int element = a.get(k-1);
		    Collections.sort(a);
		    System.out.println(a.indexOf(element)+1);
		    t--;
		}
	}
}
