import java.util.Scanner;

class Test{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			int currInput = sc.nextInt();
			
			if(currInput != 42) {
				System.out.println(currInput);
			}
			else {
				break;
			}
		}
		sc.close();
	}
}