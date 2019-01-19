import java.util.*;
import java.io.*;
class Solution 
{
	Scanner sc;
	long x;
	public Solution()
	{
		sc=new Scanner(System.in);
		while (sc.hasNextLong()){
			long x = sc.nextLong(); 
			long ans = solve(x);
			System.out.println(ans);
		}
	}
	public long solve(long x)
	{
		long s= (x/2) + (x/3) + (x/4);
		if(x>=s)
		{
			return x;
		}
		else
		{
			return solve(x/2) + solve(x/3) + solve(x/4);
		}
	}
	public static void main(String[] args) 
	{
		new Solution();
	}
}
