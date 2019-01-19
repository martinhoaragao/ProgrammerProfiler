import java.io.*;
import java.util.*;

class OrderingSoldiers {
	
	static int n;
	static int a[];
	static int lazy[];
	static int segMin[],segIdx[];
	
	public static void main(String args[]) {
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		int t = in.nextInt();
		
		while(t-- > 0){
		
			n = in.nextInt();
		
			a = new int[n + 1];
			for(int i=1;i<=n;i++)
				a[i] = i - in.nextInt();
			
			lazy = new int[4 * (n + 1)];
			segMin = new int[4 * (n + 1)];
			segIdx = new int[4 * (n + 1)];
			build(1,n,0);
			
			int rank[] = new int[n + 1];
			
			for(int i=1;i<=n;i++){
				int ans = segIdx[0];
				update(1,n,0,1,ans);
				update2(1,n,0,ans);
				rank[i] = ans;
			}
			
			int ans[] = new int[n + 1];
			for(int i=1;i<=n;i++)
				ans[rank[i]] = i;
			
			for(int i=1;i<=n;i++)
				w.print(ans[i] + " ");
			w.println();
		}
		
		w.close();
	}
	
	static void build(int s,int e,int c){
		if(s == e){
			segMin[c] = a[s];
			segIdx[c] = s;
		}
		else{
			int m = (s + e) >> 1;
			build(s,m,2*c+1);
			build(m+1,e,2*c+2);
			if(segMin[2*c+1] < segMin[2*c+2] || (segMin[2*c+1] == segMin[2*c+2] && segIdx[2*c+1] > segIdx[2*c+2])){
				segMin[c] = segMin[2*c+1];
				segIdx[c] = segIdx[2*c+1];
			}
			else {
				segMin[c] = segMin[2*c+2];
				segIdx[c] = segIdx[2*c+2];
			}
		}
	}
	
	static void update(int s,int e,int c,int l,int r){
		if(s == l && e == r){
			segMin[c]++;
			lazy[c]++;
			return;
		}
		else{
			lazy[2*c+1] += lazy[c];
			lazy[2*c+2] += lazy[c];
			segMin[2*c+1] += lazy[c];
			segMin[2*c+2] += lazy[c];
			lazy[c] = 0;
			int m = (s + e) >> 1;
			if(r <= m)
				update(s,m,2*c+1,l,r);
			else if(l > m)
				update(m+1,e,2*c+2,l,r);
			else{
				update(s,m,2*c+1,l,m);
				update(m+1,e,2*c+2,m+1,r);
			}
			int left = segMin[2*c+1];
			int right = segMin[2*c+2];
			if(left < right || (left == right && segIdx[2*c+1] > segIdx[2*c+2])){
				segMin[c] = segMin[2*c+1];
				segIdx[c] = segIdx[2*c+1];
			}
			else{
				segMin[c] = segMin[2*c+2];
				segIdx[c] = segIdx[2*c+2];
			}
		}
	}
	
	
	static void update2(int s,int e,int c,int x){
		if(s == e){
			segMin[c] = n + 1;
			lazy[c] = 0;
			return;
		}
		lazy[2*c+1] += lazy[c];
		lazy[2*c+2] += lazy[c];
		segMin[2*c+1] += lazy[c];
		segMin[2*c+2] += lazy[c];
		lazy[c] = 0;
		int m = (s + e) >> 1;
		if(x <= m)	update2(s,m,2*c+1,x);
		else		update2(m+1,e,2*c+2,x);
		int left = segMin[2*c+1];
		int right = segMin[2*c+2];
		if(left < right || (left == right && segIdx[2*c+1] > segIdx[2*c+2])){
			segMin[c] = segMin[2*c+1];
			segIdx[c] = segIdx[2*c+1];
		}
		else{
			segMin[c] = segMin[2*c+2];
			segIdx[c] = segIdx[2*c+2];
		}
	}
	
	static class InputReader {

		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar;
		private int snumChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}

			int res = 0;

			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));

			return res * sgn;
		}
		
		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}

			long res = 0;

			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));

			return res * sgn;
		}
		
		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}

}
