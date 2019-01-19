import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int test = s.nextInt();
		while(test-->0)
		{
			int sum=0;
			int sumosum=0;
			int n=s.nextInt();
			while(n-->0)
			{
				sum+=s.nextInt();
				sumosum+=s.nextInt();
			}
			System.out.println(sum-sumosum);
		}
	}
}