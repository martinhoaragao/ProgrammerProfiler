import java.util.Scanner;

class Codechef{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int no = sc.nextInt();
			if(no == 42) {
				break;
			} else {
				System.out.println(no);
			}
		}
		sc.close();
	}

}