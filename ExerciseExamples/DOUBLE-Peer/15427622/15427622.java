import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			long len = sc.nextLong();
			if(len%2==0)System.out.println(len);
			else System.out.println(len-1);
			n--;
		}
	}

}
