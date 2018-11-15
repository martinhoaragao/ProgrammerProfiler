import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int t=s.nextInt();
		while(t>0) {
			t--;
			int n=s.nextInt();
			int m=s.nextInt();
			int d=s.nextInt();
			int D=s.nextInt();
			if(d>D || m<n*d || m>n*D) {
				out.println(-1);
				continue;
			}
			int actuald=m/n;
			int extra=m-actuald*n;
			for(int i=0;i<n;i++) {
				int loop=actuald;
				if(extra>0) {
					loop++;
					extra--;
				}
				int start=i;
				while(loop>0) {
					loop--;
					out.println((i+1)+" "+(start+1));
					start++;
					start=start%n;
				}
			}
		}
		out.close();
	}
	
	public static PrintWriter out;
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
