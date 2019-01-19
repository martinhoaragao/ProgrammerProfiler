import java.util.Scanner;
 class c6 {

	public static void main(String[] args) {
		Scanner kb =new  Scanner(System.in);
		int n ;
		n=kb.nextInt();
		double b;
		b=kb.nextDouble();
		
		if((n+0.5)<b && n%5==0 ) {
			System.out.printf("%.2f",(b-n)-0.50);
		
		}else{
			System.out.printf("%.2f",b);
		}

		
	}

}
