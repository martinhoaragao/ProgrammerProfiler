/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0) {
			int n = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				a.add(scan.nextInt());
			}
			int k = scan.nextInt();
			int kelem = a.get(k-1);
			int c = 0;
			for(int i: a){
			    if(i<=kelem) c++;
			}
			System.out.println(c);
			t--;
		}
	}
}
