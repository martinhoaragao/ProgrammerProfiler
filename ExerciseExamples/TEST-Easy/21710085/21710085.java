import java.util.Scanner;

class TEST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num!=42){
			System.out.println(num);
			num = sc.nextInt();
		}
	}

}
