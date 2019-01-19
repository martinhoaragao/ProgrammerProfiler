import java.util.Scanner;
class ATM 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	  float withdrawAmount=sc.nextFloat();
	  float balanceAmount=sc.nextFloat();
	  float output=balanceAmount;
		if(withdrawAmount%5==0)
		{
			if(balanceAmount>(withdrawAmount+0.50))
			{
				output=balanceAmount-(withdrawAmount+0.50f);
			}
		}
		System.out.printf("%.2f",output);
		
		

	}

}
