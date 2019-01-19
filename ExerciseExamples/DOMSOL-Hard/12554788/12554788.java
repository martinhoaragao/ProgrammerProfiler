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
	int n;
	long input[][];
	long dp[];
	public Solution()
	{
		sc=new FastReader();
		n=sc.nextInt();
		input=new long[2][n];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<n;j++)
			{
				input[i][j]=sc.nextLong();
			}
		}
		dp=new long[n];
		if(n==1)
		{
			System.out.println(Math.abs(input[0][0]-input[1][0]));
		}
		else
		{
			dp[n-1]=Math.abs(input[0][n-1]-input[1][n-1]);
			for(int i=n-2;i>=0;i--)
			{
			dp[i]=Math.max(Math.abs(input[0][i]-input[1][i])+solve(i+1),Math.abs(input[0][i]-input[0][i+1])+Math.abs(input[1][i]-input[1][i+1])+solve(i+2));
			}
			System.out.println(dp[0]);
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.print(dp[i]+" ");
		}
		System.out.println();*/
	}
	public long solve(int ind)
	{
		if(ind>=n)
		{
			return 0;
		}
		else 
		{
			return dp[ind];
		}
	}
	public static void main(String[] args) 
	{
		new Solution();
	}
}
