import java.util.*;
import java.io.*;
class FastReader
{
BufferedReader br;
StringTokenizer st;

public FastReader()
{
	br = new BufferedReader(new
			 InputStreamReader(System.in));
}

String next()
{
	while (st == null || !st.hasMoreElements())
	{
		try
		{
			st = new StringTokenizer(br.readLine());
		}
		catch (IOException  e)
		{
			e.printStackTrace();
		}
	}
	return st.nextToken();
}

int nextInt()
{
	return Integer.parseInt(next());
}

long nextLong()
{
	return Long.parseLong(next());
}

double nextDouble()
{
	return Double.parseDouble(next());
}

String nextLine()
{
	String str = "";
	try
	{
		str = br.readLine();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	return str;
}
}
class Solution 
{
	FastReader sc;
	int t;
	int n;
	int arr[];
	public Solution()
	{
		sc=new FastReader();
		t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
			n=sc.nextInt();
			arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int ind=sc.nextInt();
			int key=arr[ind-1];
			Arrays.sort(arr);
			int pos=Arrays.binarySearch(arr,key);
			System.out.println(pos+1);
		}
	}
	public static void main(String[] args) 
	{
		new Solution();
	}
}
