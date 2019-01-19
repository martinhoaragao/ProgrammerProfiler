

import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		float a,b;
		a=sc.nextFloat();
		b=sc.nextFloat();
		if(b>=a+0.50f && a%5==0){
		    System.out.println(String.format("%.2f",b-a-0.50f));
		}
		else System.out.println(String.format("%.2f",b));
    }
}

