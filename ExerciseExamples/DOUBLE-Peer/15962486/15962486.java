import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int testCases ;
		testCases = input.nextInt();
		while (testCases != 0) {
			int n = input.nextInt();
			if (n % 2 != 0) {
				n--;
			}
			System.out.println(n);
			testCases--;
		}
	}
}