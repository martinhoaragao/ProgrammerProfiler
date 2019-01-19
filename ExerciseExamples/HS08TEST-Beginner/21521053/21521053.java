import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		double bal = scn.nextDouble() ;
		
		if ( n % 5 == 0 )
		{
			if ( n + 0.5 < bal )
			{
				bal = bal - n - 0.5 ;
			}
		}
		
		System.out.printf("%.2f",bal);
		
	}

}
