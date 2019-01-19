/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
	public static void main (String[] args) throws java.lang.Exception {
		int t, n, n1, n2, sum1, sum2;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int ctr=0; ctr<t; ctr++) {
			n = sc.nextInt();
			sum1 = 0;
			sum2 = 0;
			for (int i=0; i<n; i++) {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				sum1 += n1;
				sum2 += n2;
			}
			System.out.println(sum1-sum2);
		}
		sc.close();
	}
}