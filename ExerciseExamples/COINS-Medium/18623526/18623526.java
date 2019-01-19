

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<Integer, Long> byteValue = new HashMap<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		final InputStreamReader isr = new InputStreamReader(System.in);
		final BufferedReader br = new BufferedReader(isr);

		String line;
		while ((line = br.readLine()) != null) {
			final int i = Integer.parseInt(line);
			System.out.println(getBytecoins(i));
		}
		br.close();
	}

	static long getBytecoins(int i) {
		final int n = i / 2 + i / 3 + i / 4;
		if (n <= i) {
			return i;
		} else {
			if (byteValue.containsKey(n)) {
				return byteValue.get(n);
			}
			return getBytecoins(i / 2) + getBytecoins(i / 3) + getBytecoins(i / 4);
		}
	}
}
