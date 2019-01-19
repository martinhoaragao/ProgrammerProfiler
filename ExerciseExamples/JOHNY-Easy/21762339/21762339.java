/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=0; i<test_case; i++) {
			int t =sc.nextInt();
			int[] arr1 = new int[t];
			for(int j = 0; j<t; j++) {
				arr1[j]= sc.nextInt();
			}
			int k = sc.nextInt();
			int find_no = arr1[k-1];
			Arrays.sort(arr1);
			for(int l = 0;l<t;l++) {
				if(arr1[l]==find_no) {
					System.out.println(l+1);
				}
			}
		}
	}
}
