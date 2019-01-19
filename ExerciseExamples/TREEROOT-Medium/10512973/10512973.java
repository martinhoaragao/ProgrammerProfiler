
import java.util.*;
import java.io.*;



 class EvilTree {

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
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
	}

	static public void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);

		int testCases = in.nextInt();
		int res[] = new int[testCases];
		
		for (int i = 0; i < testCases; i++) {
			int result = 0;
			int node = in.nextInt();
			for(int j=0;j<node;j++){
				int x = in.nextInt();
				int y = in.nextInt();
				result = result + (x - y);
			}
			res[i] = result;
		}		
		for(int k=0;k<testCases;k++){
			System.out.println(res[k]);
		}
	}
	

}

