import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int j=0; j<t; j++) {
			int n = Integer.parseInt(sc.nextLine());
			int suml = 0;
			int sumr = 0;
			
			for(int l=0; l<n; l++){
				String[] str = sc.nextLine().split(" ");
				suml+=Integer.parseInt(str[0]);
				sumr+=Integer.parseInt(str[1]);
			}
			
			System.out.println(suml-sumr);
		}
	}
}
