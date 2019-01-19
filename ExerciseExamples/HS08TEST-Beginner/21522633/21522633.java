import java.util.*;
public class Main
{   
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double b=sc.nextDouble();
		if(a%5==0)
		{   if((a+0.5)<b)
			   b=(b-((double)a+0.50));						
		}
		System.out.printf("%.2f",b);			
	}
}