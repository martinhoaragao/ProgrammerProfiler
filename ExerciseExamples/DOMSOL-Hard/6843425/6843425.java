import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author Agostinho Junior (junior94)
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		Domsol solver = new Domsol();
		solver.solve(1, in, out);
		out.close();
	}
}

class Domsol {

	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int n = in.readInt();
		int[][] grid = new int[2][n + 1];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = in.readInt();
			}
		}
		
		int[] dp = new int[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			dp[i] = Math.abs(grid[0][i] - grid[1][i]) + dp[i + 1];
			if (i + 2 <= n) {
				int sum = 0;
				for (int j = 0; j < 2; j++) {
					sum += Math.abs(grid[j][i] - grid[j][i + 1]);
				}
				dp[i] = Math.max(dp[i], sum + dp[i + 2]);
			}
		}

		out.println(dp[0]);
	}

}

class InputReader {
	private BufferedReader input;
	private StringTokenizer line = new StringTokenizer("");

	public InputReader(InputStream in) {
		input = new BufferedReader(new InputStreamReader(in));
	}

	public void fill() {
		try {
			if(!line.hasMoreTokens()) line = new StringTokenizer(input.readLine());
		} catch(IOException io) { io.printStackTrace(); System.exit(0);}
	}

	public int readInt() {
		fill();
		return Integer.parseInt(line.nextToken());
	}

}

class OutputWriter {
	private PrintWriter output;

	public OutputWriter(OutputStream out) {
		output = new PrintWriter(out);
	}

	public void println(Object o) {
		output.println(o);
	}

	public void close() {
		output.close();
	}
}

