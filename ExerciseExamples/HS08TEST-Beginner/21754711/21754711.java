import java.util.Scanner;
class Atm
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the withdrawl amount.");
		double x=sc.nextDouble();
		//System.out.println("Enter account balance");
		double y=sc.nextDouble();
	    if(x%5==0 && y>=x+0.5)
	    {
	        y=y-x-0.5;
	        System.out.printf("%.2f", y);
	    }
	    else{
	        System.out.printf("%.2f", y);
	    }
	}
}