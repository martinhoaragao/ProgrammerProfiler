import java.util.*;
class coins
{
	static long[] arr;
	static long a =0 ,max =0 ;
	
	public static void init()
	{
		a =0 ;max =0 ;
		arr = new long[10000];
	}
	public static long bytecoin(long n)
	{
		if((n/2)+(n/3)+(n/4) > n)
		{
			
			a = bytecoin(n/2)+bytecoin(n/3)+bytecoin(n/4);
			max = a;
			
		}
		else
			return n;


		return a;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String line = " ";
		
			while(s.hasNext())
			{
			line = s.nextLine();
			long a = Long.parseLong(line);
			init();
			long j = bytecoin(a);
			if(max == 0)
				System.out.println(a);
			else
				System.out.println(max);
		
			}
			
		
	}
}