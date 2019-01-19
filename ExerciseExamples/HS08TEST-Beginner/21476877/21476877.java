import java.util.Scanner;
class ATM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		//System.out.println("Enetr the amount balance "+y);
		double y;
		y=sc.nextDouble();
		//System.out.println("Enter the withdraw amount "+x);
		double z;
		if(x%5==0&&(x+0.50)<y)
		{
				z=(y-x)-0.50;
				System.out.printf("%.2f\n",z);
		}
		else
		{
			System.out.printf("%.2f\n",y);
		}
	}
}
