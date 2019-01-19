import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i=-1,j;
		int a[]=new int[100];
		int b[]=new int[100];
		do
		{
			a[++i]=s.nextInt();	
		}while(a[i]!=42);
		for(j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
	}
}