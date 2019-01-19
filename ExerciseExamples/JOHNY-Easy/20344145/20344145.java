import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
			int n=in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
			a[j]=in.nextInt();
			int k=in.nextInt();
			int m=a[k-1];
			Arrays.sort(a);
			int l=Arrays.binarySearch(a,m);
			System.out.println(l+1);
			}
	}
}