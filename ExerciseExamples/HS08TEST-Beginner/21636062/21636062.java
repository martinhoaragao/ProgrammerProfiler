import java.util.Scanner;

class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int withdrawlAmount ;
	double transactionCharge=0.50;
	double accountBalance ;
	double netBalance;
	
	Scanner scanner = new Scanner(System.in); 
	withdrawlAmount = scanner.nextInt();
	 accountBalance = scanner.nextDouble();
	if (accountBalance>withdrawlAmount+transactionCharge){
    	if(withdrawlAmount%5==0){
	     netBalance = accountBalance-withdrawlAmount-transactionCharge;
	      System.out.println(netBalance);}
	    else 
	       {System.out.println(accountBalance);}
	}       
	else
	  {System.out.println(accountBalance);}
	  
	       
	
	}
}
