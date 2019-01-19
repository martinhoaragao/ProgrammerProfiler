import java.util.Scanner;

class Code_Chef_Factorials {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int amt_draw = 0;
		double amt_avail = 0;
		
		amt_draw = inp.nextInt();
		amt_avail = inp.nextDouble();
		
		if( amt_draw % 5 != 0 || amt_avail < (amt_draw + 0.50 ))
			System.out.printf("%.2f\n",amt_avail);
		else
			System.out.printf("%.2f\n",amt_avail - (amt_draw + 0.50));
			
	}
}
