import java.util.Scanner;
class InputOutput {

public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	while(true){
		number = sc.nextInt();
		if(number!=42)
			System.out.println(number);
		else
			System.exit(0);
		
		
	}
}

}