import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoubleString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(input.readLine());

		while (T > 0) {
			Long palindromeLength = Long.parseLong(input.readLine());
			if ((palindromeLength % 2) == 0) {
				System.out.println(palindromeLength);
			} else {
				System.out.println(palindromeLength-1);
			}
			T--;
		}
	}

}
