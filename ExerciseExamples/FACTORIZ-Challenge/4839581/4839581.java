/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger one = BigInteger.valueOf(1);
		BigInteger max = BigInteger.valueOf(1000);
		while (t-->0) {
			BigInteger n;
			n = scan.nextBigInteger();
			int[] arr = new int[100000];
			int cnt=0;
			BigInteger two = BigInteger.valueOf(2);
			while (n.mod(two)==zero) {
				n=n.divide(two);
				arr[cnt++]=2;
			}
			
			for (BigInteger i=BigInteger.valueOf(3); i.compareTo(max)==-1; i=i.add(two)) {
				while (n.mod(i)==zero) {
					n = n.divide(i);
					arr[cnt++]=i.intValue();
				}
			}
			int p = cnt;
			if (n.compareTo(one)!=0) {
				System.out.println(p+1);
				System.out.println(n);
				for (int j=0; j<p; j++) System.out.println(arr[j]);
			} else {
				System.out.println(p);
				for (int j=0; j<p; j++) System.out.println(arr[j]);
			}
		}
		
	}
}