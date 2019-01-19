import java.util.Scanner;

class Chef1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer:
		while(true) {
			int i =sc.nextInt(); 
			if(i == 42) {
				break outer;
			}
			
			System.out.println(i);
			
		}
	sc.close();
	}
}
