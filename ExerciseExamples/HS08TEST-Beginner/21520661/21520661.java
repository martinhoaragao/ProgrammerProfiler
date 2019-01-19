import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int X = Integer.parseInt(input[0]);
		float Y = Float.parseFloat(input[1]);
		if(X % 5 == 0 && (Y - 0.50) >= X) {
			System.out.format("%.2f", Y - X - 0.50);
		}
		else {
			System.out.format("%.2f", Y);
		}
	}
}