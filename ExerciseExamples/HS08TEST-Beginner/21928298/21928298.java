import java.util.Scanner;
 class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double wdr = sc.nextDouble();
		double bal = sc.nextDouble();
		
		if((wdr%5)==0 && (wdr+0.50)<bal) {
		bal=bal-wdr-0.50;
			System.out.printf("%.2f",bal);
			}
		else 
		{
			System.out.printf("%.2f",bal);
			}
		//sc.close();
		
			
	}
	}
