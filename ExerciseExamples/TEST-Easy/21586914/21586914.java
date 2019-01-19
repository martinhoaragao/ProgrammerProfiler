import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		while(true){
			int input = sc.nextInt();
			if(input == 42){
				System.exit(0);
			}
			System.out.println(input);
		}
	}
}