import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte T;
		short N;
		int idsSum, childrenSum;
		
		T = input.nextByte();
		for (int testCase = 0; testCase < T; testCase++) {
			idsSum = 0; childrenSum = 0;
			N = input.nextShort();
			for (int pair = 0; pair < N; pair++) {
				int id = input.nextShort();
				int children = input.nextShort();
				
				idsSum += id;
				childrenSum += children;
			}
			System.out.println(idsSum - childrenSum);
		}
		
		input.close();		
	}

}
