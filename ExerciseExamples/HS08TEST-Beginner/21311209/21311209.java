import java.util.*;
class Solution
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	Double b=s.nextDouble();
	
	if((a%5)==0)
	{
	double c=(b-a)-0.50;
	if(c>=0)
System.out.printf("%.2f",c);
	else
	System.out.printf("%.2f",b);
	}
	else
	System.out.printf("%.2f",b);
	}
	
}