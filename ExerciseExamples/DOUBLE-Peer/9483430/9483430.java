import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t=0; t<T; t++){
			int a = in.nextInt();
			a = a - (a%2);
			System.out.println(a);
		}
	}
}