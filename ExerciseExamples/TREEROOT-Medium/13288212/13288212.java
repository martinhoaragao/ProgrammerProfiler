//package Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class TREEROOT {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), root=0;
			while(n-->0){
				int id = r.ni(), sid = r.ni();
				root+=(id-sid);
			}
			w.println(root);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}

class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static BigInteger big;
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}
	static String next() throws IOException {
		while ( ! tokenizer.hasMoreTokens() ) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	static String rl() throws IOException{
		String s = reader.readLine();
		return s;
	}
	static int ni() throws IOException {
		return Integer.parseInt( next() );
	}
	static double nd() throws IOException {
		return Double.parseDouble( next() );
	}
	static long nl() throws IOException {
		return Long.parseLong( next() );
	}
	static BigInteger nb() throws IOException{
		return big = new BigInteger( next() );
	}
	static int[] nia(int n) throws IOException{
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i]=ni();
		return a;
	}
	static long[] nla(long n) throws IOException{
		long[] a = new long[(int)n];
		for(int i=0; i<n; i++) a[i]=nl();
		return a;
	}
	static double[] nda(int n) throws IOException{
		double[] a = new double[n];
		for(int i=0; i<n; i++) a[i]=nd();
		return a;
	}
	static char[] nca() throws IOException{
		char[] a = next().toCharArray();
		return a;
	}
	static BigInteger[] nba(int n) throws IOException{
		BigInteger[] a = new BigInteger[n];
		for(int i=0; i<n; i++) a[i]=nb();
		return a;
	}
	static int[][] ni2(int m, int n) throws IOException{
		int[][] a = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=ni();
			}
		}
		return a;
	}
	static long[][] nl2(long m, long n) throws IOException{
		long[][] a = new long[(int)m][(int)n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nl();
			}
		}
		return a;
	}
	static double[][] nd2(int m, int n) throws IOException{
		double[][] a = new double[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nd();
			}
		}
		return a;
	}
	static BigInteger[][] nb2(int m, int n) throws IOException{
		BigInteger[][] a = new BigInteger[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nb();
			}
		}
		return a;
	}
}