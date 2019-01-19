import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short t = Short.parseShort(sc.nextLine());
		
		while(t-- != 0) {
			String word = sc.nextLine().trim();
			short count = 0;
			
			for(short i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if(c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q' || c == 'R')
					count++;
				else if(c == 'B')	
					count += 2;
			}
			System.out.print(count+"\r\n");
		}
		sc.close();
	}
}