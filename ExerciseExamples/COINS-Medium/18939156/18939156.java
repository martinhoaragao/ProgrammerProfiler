import java.util.*;
 
 
class Cions
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			long num_o=sc1.nextLong();
			System.out.println(max(num_o));
		}
	}
	static long max(long num_o)
	{
		long number;
		number=(num_o/2)+(num_o/3)+(num_o/4);
		if(number>num_o)
			return max(num_o/2)+max(num_o/3)+max(num_o/4);
		else
			return num_o;
	}
	
	
} 