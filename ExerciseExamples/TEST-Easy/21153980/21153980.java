import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			num = scanner.nextInt();
			
			if(num!=42){
				System.out.println(num);
			}else{
				System.exit(0);
			}
		}
		
	}
}
