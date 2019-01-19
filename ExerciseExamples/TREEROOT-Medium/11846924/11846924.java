import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class TreeRoot {

	public static void main(String args[]) throws Exception {
		PrintWriter pw = new PrintWriter(System.out);
		Reader.init(System.in);
		int T, N, id, sumId, root;
		T=Reader.nextInt();
		while(T-->0) {
			N=Reader.nextInt();
			root=0;
			while(N-->0) {
				id=Reader.nextInt();
				sumId=Reader.nextInt();
				root+=id-sumId;
			}
			pw.println(root);
		}
		pw.println();
		pw.flush();
	}
}

class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

}
