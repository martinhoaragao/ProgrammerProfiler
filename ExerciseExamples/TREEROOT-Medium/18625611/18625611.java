

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		final InputStreamReader isr = new InputStreamReader(System.in);
		final BufferedReader br = new BufferedReader(isr);

		final String line = br.readLine();
		final int T = Integer.parseInt(line);
		for (int i = 0; i < T; i++) {
			final int N = Integer.parseInt(br.readLine());
			int rootId = 0;
			for (int j = 0; j < N; j++) {
				final String node = br.readLine();
				final int id = Integer.parseInt(node.split(" ")[0].trim());
				final int sum = Integer.parseInt(node.split(" ")[1].trim());
				rootId += id - sum;
			}
			System.out.println(rootId);
		}
		br.close();
	}
}
