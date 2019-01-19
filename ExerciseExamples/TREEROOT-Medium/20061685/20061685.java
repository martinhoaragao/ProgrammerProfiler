import java.util.Scanner;

class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int ns = 0;
			int cs = 0;
			while(n-- > 0){
				ns += sc.nextInt();
				cs += sc.nextInt();
			}
			System.out.println(ns-cs);
		}
	}
}















