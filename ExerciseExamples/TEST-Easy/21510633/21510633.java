

import java.util.Scanner;

class OutTill42 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		int k;
		while((k = sr.nextInt()) != 42) {
			System.out.println(k);
		}
		sr.close();
	}

}
