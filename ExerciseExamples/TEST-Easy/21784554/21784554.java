import java.util.Scanner;
public class Main {

	public static void main(String[] arg) {

		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int num=sc.nextInt();
			if(num!=42) {
				System.out.println(num);
			}
			else {
				break;
			}

		}
	}
 }