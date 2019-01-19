import java.io.*;
import java.util.*;

class test
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++)
		{
			int N=sc.nextInt();
			int A[]=new int[N];
			for(int i=0;i<N;i++)
				A[i]=sc.nextInt();
			int K=sc.nextInt();
			int ele=A[K-1];
			Arrays.sort(A);
			int index=Arrays.binarySearch(A,ele);
			System.out.println(index+1);
		}
	}
}