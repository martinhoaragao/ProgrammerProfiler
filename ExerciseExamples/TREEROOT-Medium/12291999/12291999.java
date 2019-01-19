import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.util.StringTokenizer;

public class Main {

	public static PrintWriter pw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		pw = new PrintWriter(new BufferedOutputStream(System.out));
		MyScanner sc = new MyScanner();
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			
			int id, childSum;
			int rootId = 0;
			for (int j = 0; j < N; j++) {
				id = sc.nextInt();
				childSum = sc.nextInt();
				rootId += (id - childSum);
			}
			
			pw.println(rootId);
		}
		
		pw.close();
	}
		
}

//-----------MyScanner class for faster input----------
class MyScanner {
	BufferedReader br;
	StringTokenizer st;

	public MyScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine(){
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
