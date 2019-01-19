import java.util.Scanner;
class ATMfromcodechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int X=scan.nextInt();
		double Y=scan.nextDouble();
		if(X>Y-0.5)
		{
			System.out.printf("%.2f",Y);
		}
		else
		{
			if(X%5==0)
			{
				System.out.printf("%.2f",Y-X-0.5);
			}
			else
				System.out.printf("%.2f",Y);	
		}
	}

}
