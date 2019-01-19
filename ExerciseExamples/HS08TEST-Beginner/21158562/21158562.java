import java.text.DecimalFormat;
import java.util.Scanner;
class Cash 
{
	public static void main(String args[])
	{
		Scanner S = new Scanner (System.in);
		
		int x = S.nextInt();
		double y = S.nextDouble();
		if (x%5==0 && x<=(y-0.5))
		{
			y -= x;
			y -= 0.5;
		}
		System.out.print(new DecimalFormat("#0.00").format(y));
			
	}
}
	

