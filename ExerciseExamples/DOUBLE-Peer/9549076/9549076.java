import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(inp.readLine());
		for (int i = 0; i < t; i ++) {
			int n = Integer.valueOf(inp.readLine());
			if (n % 2 == 0) {
				System.out.println(n);
			}
			else {
				System.out.println(n-1);
			}
		}

	}
}
