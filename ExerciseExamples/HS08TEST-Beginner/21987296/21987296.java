import java.util.Scanner;

 

class Account
{

	
	public static void main(String[] args) 
	{

		
		Scanner scn = new Scanner(System.in);
		
		double withdrawAmount = scn.nextDouble();

		
		double balance = scn.nextDouble();

		
		if ((withdrawAmount+0.50) > balance|| (withdrawAmount % 5) != 0) 
		{
			
			System.out.printf("%.2f", balance);
		
		} 	
		else 
		{
			
			balance = balance - withdrawAmount - 0.50;
			
			System.out.printf("%.2f", balance);
		
		}
	
	}


}