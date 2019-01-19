import java.util.Scanner;
class p1 
{	
	public static void main(String[] args) 
	{
		int t,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			n=sc.nextInt();
			if(n%2==0)
			System.out.println(n+"\n");
			else
			System.out.println(n-1+"\n");
		}
	}
}
