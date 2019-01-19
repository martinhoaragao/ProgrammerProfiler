import java.util.Scanner;

class pooja
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	float bal = sc.nextFloat();
	if ( n % 5 == 0 && n + 0.50 <= bal )
		System.out.print(bal - n - 0.50);
	else
		System.out.print(bal);
	}
}