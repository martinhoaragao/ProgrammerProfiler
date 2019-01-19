import java.util.*;
 class coin {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long []arr=new long[10000000];
	while(s.hasNext())
	{
		long n=s.nextLong();
		if(n>9999999)
		System.out.println(max(n,arr));
		else
			System.out.println(div(n,arr));
	}
}

public static long max(long n,long []arr)
{
	if(n<=11)
		return n;
	
	if(n<9999999)
	{
		return div(n,arr);
	}
	
	long sum=max(n/2,arr)+max(n/3,arr)+max(n/4,arr);
	if(sum>n)
	{
		return max(n/2,arr)+max(n/3,arr)+max(n/4,arr);
	}
	return n;
}

public static long div(long n,long []arr)
{
	if(n<=11)
		return n;
	
	if(arr[(int)n]!=0)
	{
		return arr[(int)n];
	}
	
	else
	{long max_n=n;
		long ans=div(n/2,arr)+div(n/3,arr)+div(n/4,arr);
		if(ans>max_n)
		{
			arr[(int)n]=ans;
		}
		else
			arr[(int)n]=max_n;
	}
	return arr[(int)n];
}
}
