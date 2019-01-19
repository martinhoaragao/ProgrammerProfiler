import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Johny
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
			n=in.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++)
			a[j]=in.nextInt();
			int p;
			p=in.nextInt();
			int fav= a[p-1];
			Arrays.sort(a);
			for(int j=0;j<n;j++)
			if(a[j]==fav)
			{
				p=j;
			    break;
			}
			System.out.println(p+1);
		}
	}
}