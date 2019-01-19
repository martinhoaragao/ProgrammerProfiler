import java.util.*;

class ATM {
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double a = c.nextDouble();
		double b = c.nextDouble();
		System.out.println((a%5 == 0)?((a+0.5 <= b)?b-(a+0.5) : b):b);
	}
}