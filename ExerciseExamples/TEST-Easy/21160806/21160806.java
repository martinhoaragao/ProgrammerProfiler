import java.util.*;
class rewrite
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		int a[]=new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==42)
				count++;
			if(count!=0)
			{
				
				break;
			}
				
			
		}
		for(int i=0;i<a.length && a[i]!=42;i++)
			System.out.print(a[i]+" ");
	}
}