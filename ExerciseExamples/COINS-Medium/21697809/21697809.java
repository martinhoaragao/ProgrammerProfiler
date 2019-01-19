import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			long n = sc.nextLong();
			long max = exchMax(n);
			System.out.println(max);
		}
		
		sc.close();
	}
	
	private static long exchMax(long n) {
		if (n<10) return n;
		
		long nE = exchMax(n/2)+exchMax(n/3)+exchMax(n/4);
		
		if(nE <= n) return n;
		return nE;
	}
}
