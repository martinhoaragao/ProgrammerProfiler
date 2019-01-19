import java.util.*;
import java.lang.*;

class uncle
{	static int N,k;
	static long[] A=new long[101];
	static long[] temp=new long[101];
	public static void main(String[]  args)
	{	
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++)
		{		
			N=scan.nextInt();
			for(int j=1;j<=N;j++)
			{
				A[j]=scan.nextLong();
			}
			k=scan.nextInt();
			long value=A[k];
			sort(1,N);
			binary(1,N,value);
		
		}
	}
	public static void sort(int top,int bottom)
	{	if(top!=bottom)
		{
			int mid=(top+bottom)/2;
			sort(top,mid);
			sort(mid+1,bottom);
			sorting(top,mid,bottom);

		}
	}
	
	public static void sorting(int top,int mid,int bottom)
	{	int t1=top,b1=mid,t2=mid+1,b2=bottom;
		
		int index=top;
		//System.out.println(t1+"  "+t2);
		while(t1<=b1 && t2<=b2)
		{
			if(A[t1]<=A[t2])
			{
				temp[index]=A[t1];
				t1++;
			}
			else
			{			
				temp[index]=A[t2];
				t2++;
			}			
			//System.out.println(temp[index]);
			index++;
			
		}
		if(t1<=b1)
		{
			for(int a=index;t1<=b1;a++)
			{
				temp[a]=A[t1];
				index++;
				t1++;
			}

		}
		else 
		{	for(int a=index;t2<=b2;a++)
			{	
				temp[a]=A[t2];
				index++;
				t2++;
			}

		}
		
		/*if(bottom==N)
		{*/
			for(int i=top;i<=bottom;i++)
			{
				A[i]=temp[i];
				//System.out.println(A[i]);
			}
		/*}*/

	}

	public static void binary(int top,int bottom,long value)
	{
		int mid=(top+bottom)/2;
		if(value==A[mid])
			System.out.println(mid);
		else if(value<A[mid])
		{
			binary(top,mid,value);
		}
		else
			binary(mid+1,bottom,value);
		
	}


}