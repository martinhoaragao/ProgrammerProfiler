import java.util.*;
class Coins
{
	static long solve(long n)
	{
		if(n<12)
			return n;
		return solve(n/2)+solve(n/3)+solve(n/4);
	} 

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int c=0;
		while(c<10)
		{
           long number=sc.nextLong();
            System.out.println(solve(number));
            c++;
		}
	}
}