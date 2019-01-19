import java.util.Scanner;

class second {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		double b;
		
		a=scan.nextInt();
		b=scan.nextDouble();
		
		if(a%5==0 && b>a+0.5) {
			System.out.printf("%.2f",b-(a+0.5));
			
		}
		else {
			System.out.printf("%.2f",b);
		}
		
	}

}
