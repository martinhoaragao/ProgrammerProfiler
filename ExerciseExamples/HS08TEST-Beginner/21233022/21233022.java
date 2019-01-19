import java.util.*;
class ATM {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int w = sc.nextInt();
		double a = sc.nextDouble();
		if(w % 5 == 0 && (w + 0.5) <= a) {
			a = a - (w + 0.5);
		}
		System.out.printf("%.2f\n", a);
		sc.close();
	}
}
