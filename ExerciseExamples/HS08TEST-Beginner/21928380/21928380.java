import java.util.Scanner;
 class ATM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double wdr = sc.nextDouble();
		double bal = sc.nextDouble();
		double res= bal-wdr-0.50;
		
		if((wdr%5)==0 && (wdr+0.50)<bal) 
			System.out.printf("%.2f",res);
		else 
			System.out.printf("%.2f",bal);
		sc.close();
		
			
	}

}
