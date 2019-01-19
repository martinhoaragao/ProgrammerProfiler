import java.io.*;
import java.util.Scanner;
class Program
{
public static void main(String args[])
{
	int a;
	double b,c;
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextFloat();
	c=a+0.50;
	if(a%5==0)
	{
		if(c<=b)
		{
			b=b-c;
		}
	}
	System.out.println(b);
}
}