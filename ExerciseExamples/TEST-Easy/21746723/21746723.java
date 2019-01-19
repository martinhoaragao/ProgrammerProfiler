
import java.util.Scanner;

class TEST{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h;
		
		do {
		h = in.nextInt();
		
		if(h!=42) {
			System.out.println(h);
			
		}
		}while(h!=42);
	}
	
	
	
}