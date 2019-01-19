import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;
 
class FastScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	public FastScanner() {
		this(System.in);
	}
	public FastScanner(InputStream is) {
		mIs = is;
	}
	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = mIs.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}
	public String nextString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}
	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
	public boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}
}
 
class SegmentTree {
	private int segTreeSize;
	private int segTree[];
	private void build(int root, int begin, int end) {
		if (begin > end) return;
		if (begin == end) {
			segTree[root] = 1;
			
			return;
		}
		int left = (root << 1);
		int right = (root << 1) + 1;
		int mid = begin + ((end-begin) >> 1);
		build(left, begin, mid);
		build(right, mid+1, end);
		segTree[root] = segTree[left] + segTree[right];
		
	}
	public void build(int size) {
		segTreeSize = size;
		segTree = new int[segTreeSize << 2];
		build(1, 0, segTreeSize-1); 
	}
	private int pop(int root, int begin, int end, int rank) {
		
		if (begin == end) {
			segTree[root] = 0; // update call.
			
			return begin;
		}
		int result = -1;
		int left = (root << 1);
		int right = (root << 1) + 1;
		int mid = begin + ((end-begin) >> 1);
		if (rank <= segTree[left]) {
			result = pop(left, begin, mid, rank);
		} else {
			rank -= segTree[left];
			result = pop(right, mid+1, end, rank);
		}
		segTree[root] = segTree[left] + segTree[right];
		return result;
	}
	public int pop(int rank) {
		int result = 1 + pop(1, 0, segTreeSize-1, rank);
		
		return result;
	}
}
 
public class Main {
	public SegmentTree segTree;
 
	public Main() {
		segTree = new SegmentTree();
	}
 
	public static void main(String[] args) throws Exception {
		
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printer = new PrintWriter(System.out);
 
		
		int T = Integer.parseInt(scanner.readLine());
		while(T-- > 0) {
			
			int N = Integer.parseInt(scanner.readLine());
			
			String array[] = scanner.readLine().split("\\s");
			
			Main m = new Main();
			m.segTree.build(N);
			
			int result[] = new int[N];
			for (int i=N-1; i>=0; i--) {
				int rank = i + 1 - Integer.parseInt(array[i]);
				result[i] = m.segTree.pop(rank);
			}
			
			for (int i=0; i<N; i++) {
				printer.print(result[i]);
				printer.print(" ");
			}
			printer.println();
		}
		printer.flush();
		printer.close();
	}
 
}  