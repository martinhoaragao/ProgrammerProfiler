import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder op = new StringBuilder();
		int cases = Integer.parseInt(reader.readLine().trim());
		while (cases-- > 0) {
			int n = Integer.parseInt(reader.readLine().trim());
			int sum = 0;
			for (int i = 0; i < n; i++) {
				String[] split = reader.readLine().split("\\s");
				sum += Integer.parseInt(split[0]) - Integer.parseInt(split[1]);
			}
			op.append(sum).append("\n");
		}
		System.out.println(op.toString());
	}

}