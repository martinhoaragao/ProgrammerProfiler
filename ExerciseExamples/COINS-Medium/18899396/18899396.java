import java.io.*;
import java.util.*;
 
 
class NN
{
	static Hashtable<Long,Long> ht;
	static long maxCoin(long n)
	{
		if(ht.containsKey(n))
			return ht.get(n);
		else if(n<=2)
			{ ht.put(n,n); return ht.get(n);}
		else
			{ht.put(n,Math.max(n,maxCoin(n/2)+maxCoin(n/3)+maxCoin(n/4)));return ht.get(n);}
	}
	
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		ht=new Hashtable<Long,Long>();
		while(sc.hasNext())
		{
			System.out.println(maxCoin(sc.nextLong()));
		}
		
	}
}