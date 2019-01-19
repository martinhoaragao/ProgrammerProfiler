import java.util.Scanner;

class Account {
    private Double balance;
    private Double BANK_CHARGE = 0.5;
    
    Account(Double balance) {
        this.balance = balance;
    }
    
    public void withdraw(Double amount) {
    	if ((amount % 5.0 == 0) && this.balance >= (amount + BANK_CHARGE)) {
    	    this.balance -= (amount + BANK_CHARGE);
    	}
    }
    
    public Double getBalance() {
        return this.balance;
    }
}


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        Double amountToWithdraw = Double.parseDouble(inputs[0]);
        Double totalBalance = Double.parseDouble(inputs[1]);
        Account account = new Account(totalBalance);
        account.withdraw(amountToWithdraw);
        System.out.println(account.getBalance());
	}
	
}
