import java.util.*;
class DOUBLE
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t,n;
		t=sc.nextInt();
		while(t--!=0)
		{
			n=sc.nextInt();
			if(n%2==0)
				System.out.println(n);
			else if(n%2==1)
				System.out.println(n-1);
		}
	}
}