import java.util.Scanner;

class ATMProblem {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		float X = sc.nextFloat();
		float Y= sc.nextFloat();
		
		if ( X%5==0 && Y >=(X + 0.50)){
			
			System.out.printf("%.2f", (Y-(X+0.50)));
		}
		else
		{
			System.out.printf("%.2f",Y);
		}
		
	}

}
