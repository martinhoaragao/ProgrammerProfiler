import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int withdrawl;
		double balance;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(" +");
			withdrawl = Integer.parseInt(input[0]);
			balance = Double.parseDouble(input[1]);
		} catch (IOException ioe) {
			return;
		}

		if (((withdrawl % 5) != 0) || ((balance - 0.5d) < withdrawl)) {
			System.out.println(String.format("%.2f", balance));
		} else {
			System.out.println(String.format("%.2f", (balance - withdrawl - 0.5d)));
		}
	}
}