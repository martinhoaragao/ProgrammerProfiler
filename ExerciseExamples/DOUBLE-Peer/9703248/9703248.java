import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		while(count-- > 0){
			int inputNum = scan.nextInt();
			if( inputNum % 2 != 0 ){
				inputNum -= 1;
			}
			System.out.println( inputNum );
		}
	}

}
