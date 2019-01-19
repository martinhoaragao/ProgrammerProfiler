import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
class Det
{
	public static void main(String[] args)
	{
	    int i=0,k=0,j=0,temp=0,b=0,x=0,y=0;
	    Scanner s=new Scanner(java.lang.System.in);
		int t=s.nextInt();
		for(i=1;i<=t;i++)
		{
			int l=s.nextInt();
			int[] a=new int[l];
			for(b=0;b<l;b++)
			{
			  a[b]=s.nextInt();
			}
			int n=s.nextInt();

			k=a[n-1];

			Arrays.sort(a);
			for (x=0;x<l;x++)
			{
				
				if(a[x]==k)
				{
					out.println(x+1);
				}
			}

		}

	}
}
