import java.util.Scanner;

public class Main {

	static long getMax(long n) {
		if(((long)n/2 + (long)n/3 + (long)n/4) > n) {
			return (getMax((long)n/2) + getMax((long)n/3) + getMax((long)n/4));
		}
		else {
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n;
		String line;
		while(s.hasNextLine()) {
			line = s.nextLine();
			n = Long.parseLong(line);
			System.out.println(getMax(n));
		}
	}
}
