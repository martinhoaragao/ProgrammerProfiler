

import java.util.Scanner;

	 class Test {

	public static void main(String[] args) {
	
		
			Scanner kbd = new Scanner(System.in);
			
			int input;
			boolean check = true;
			
			while (check) {
			
			input = kbd.nextInt();
			
			if (input!=42) {
			
			System.out.println(input);
			
			} else {
			
			 check = false;
			}
		
		
		}
		}
}
