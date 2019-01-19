/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			int N = scanner.nextInt();
			int[] A = new int[N];
			for(int j =0;j<A.length;j++)
			{
				A[j]= scanner.nextInt();
			}
			int K = scanner.nextInt();
			int valueOfK = A[K-1];
			Arrays.sort(A);
			int IK = Arrays.binarySearch(A, valueOfK)+1;
			System.out.println(IK);
		}
		scanner.close();
	}
}
