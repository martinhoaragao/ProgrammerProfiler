import java.util.Scanner;
class START01 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int n_int = n.nextInt();
		if(n_int >= 0 && n_int <= 100000) System.out.print(n_int);
		n.close();
	}
}