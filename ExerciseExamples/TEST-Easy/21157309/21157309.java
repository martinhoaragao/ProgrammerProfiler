import java.util.Scanner;
class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
		int number = sc.nextInt();
		if(number != 42) System.out.println(number);
		else System.exit(0);
		}
	}
}