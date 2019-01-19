import java.util.Scanner;


class ATM {
	static int widthdraw;
	static float balance;
	Scanner sc = new Scanner(System.in);

	void setdata() {
		widthdraw = sc.nextInt();
		balance = sc.nextFloat();
	}

	float calculate(int widthdraw, float balance) {
		if (widthdraw >= 1 && widthdraw <= 2000 && balance >= 0 && balance <= 2000) 
		{
			if (widthdraw % 5 == 0 && (balance-(widthdraw+0.5)) > 0) 
			{
				balance -= (widthdraw + 0.5);
				this.balance = balance;
				return this.balance;
			} 
			else 
			{
				return balance;
			}
		}
		else {
			return balance;
		}

	}

	public static void main(String[] args) {
		ATM at1 = new ATM();
		at1.setdata();
		System.out.println(at1.calculate(widthdraw, balance));

	}

}
