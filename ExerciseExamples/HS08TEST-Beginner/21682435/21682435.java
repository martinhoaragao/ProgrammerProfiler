import java.lang.*;
import java.util.*;
class Atm
{
	public static void main(String args[])
	{
		double bal,x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		bal=sc.nextDouble();
		if(x%5==0 && x+0.50<bal)
		{
					bal=bal-x;
					bal-=0.50;
	               	System.out.printf(" %.2f",bal);
		}
		else
		{
			    System.out.printf("%.2f",bal);
		
		}
		
	    
	}
}
		
		