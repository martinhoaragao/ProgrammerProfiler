
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * @author sarthak agarwal
 *
 */
class ByteLandianGoldCoins {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FastReader s = new FastReader();
		String str = s.next();
		while(str != null)
		{
			try
			{
				long l = Long.parseLong(str);
				System.out.println(ans(l));
				str = s.next();
			}
			catch(Exception e)
			{
				break;
			}
		}
	}

	/**
	 * @param l
	 * @return
	 */
	private static long ans(long l) {
		if(l<12)
		{
			return l;
		}
		return ans(l/2)+ans(l/3)+ans(l/4);
	}
}