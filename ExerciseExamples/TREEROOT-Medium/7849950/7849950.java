import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Treeroot {
	private static final BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));

	public void solve() throws IOException {
		int t = Integer.parseInt(in.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(in.readLine());
			int result = 0;
			while (n-- > 0) {
				String[] next = in.readLine().split(" ");
				result += Integer.parseInt(next[0]) - Integer.parseInt(next[1]);
			}
			System.out.println(result);
		}
		in.close();
	}

	public static void main(String[] args) throws IOException {
		new Treeroot().solve();
	}
}
