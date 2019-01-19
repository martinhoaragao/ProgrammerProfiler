import java.util.*;

class DoubleStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i = 0;i<count;i++){
			int n = scan.nextInt();
			if (n%2!=0)
				System.out.println(n-1);
			else
				System.out.println(n);
		}
	}

}
