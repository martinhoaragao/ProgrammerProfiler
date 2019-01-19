import java.util.*;
class Atm
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	float x=sc.nextFloat();
	float y=sc.nextFloat();
	if((x%5==0) && (x+0.50<=y))  
	{
	float s=y - (0.50f);
	float z=s-x;
	System.out.printf("%.2f",z);
	}
	else
	{
	System.out.printf("%.2f",y);
	}
}
}
