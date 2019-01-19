import java.util.Scanner;
class HS08TEST
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble(), y=sc.nextDouble(), a=0;
		if(x<=0 || x>2000 || y<0 || y>2000 || (x%5)!=0)
			a=-1;
		else
			a=y-x-0.50;
		if(a<0)
			System.out.println(y);
		else
			System.out.println(a);
	}
}