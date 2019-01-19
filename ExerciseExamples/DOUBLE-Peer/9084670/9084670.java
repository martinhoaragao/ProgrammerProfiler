import java.util.*;
class double11
{
	public static void main(String args[])
	{
		int t,n;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		while(t!=0)
		{
			n=in.nextInt();
			if(n%2==0)
			System.out.println(n);
			else
			System.out.println(n-1);
			t--;
		}
	}
}