import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

/**
 * http://www.spoj.com/problems/ORDERS/
 * 
 * @author sultan.of.swing
 * 
 */

public class Main {
	public FasterScanner mFScanner;
	public PrintWriter mOut;
	public int mBIT[];
	public int mSegLeaves[];
	public int mAns[];
	public int mArray[];
	public int mMax;
	public int mN;
	public static final int sMAX = 200009;
	public static final int sMAXSeg = sMAX * 20;
	
	public Main() {
		mFScanner = new FasterScanner();
		mOut = new PrintWriter(System.out);
		mBIT = new int[sMAX];
		mArray = new int[sMAX];
		mSegLeaves = new int[sMAXSeg];
		mAns = new int[sMAX];
	}
	
	public void buildSegTree(int node, int begin, int end) {
		int mid;
		
		if (begin > end)
			return;
		
		if (begin == end) {
			mSegLeaves[node] = 1;
			return;
		}
		
		mid = begin + ((end - begin) >> 1);
		
		buildSegTree(2 * node, begin, mid);
		buildSegTree(2 * node + 1, mid + 1, end);

		mSegLeaves[node] = mSegLeaves[2 * node] + mSegLeaves[2 * node + 1];
		
	}
	
	public int query(int node, int begin, int end, int rank) {
		int mid;
		int left, right;
		
		left = right = -1;
		
		if (begin == end)
			return begin;
		
		mid = begin + ((end - begin) >> 1);
		
		if (rank <= mSegLeaves[2 * node]) {
			left = query(2 * node, begin, mid, rank);
		} else {
			rank -= mSegLeaves[2 * node];
			right = query(2 * node + 1, mid + 1, end, rank);
		}
		
		if (right == -1)
			return left;
		
		return right;
		
	}
	
	public void update(int node, int begin, int end, int index) {
		int mid;
		
		if (index < begin || index > end)
			return;
		
		if (begin == end) {
			mSegLeaves[node] = 0;
			return;
		}
		
		mid = begin + ((end - begin) >> 1);
		
		update(2 * node, begin, mid, index);
		update(2 * node + 1, mid + 1, end, index);
		
		mSegLeaves[node] = mSegLeaves[2 * node] + mSegLeaves[2 * node + 1];
	}
	
	public void solveTestCaseSeg() {
		int i;
		int id;
		int rank;
		
		buildSegTree(1, 0, mN - 1);
		
		for (i = mN - 1; i >= 0; i--) {
			rank = i + 1 - mArray[i];
			id = query(1, 0, mN - 1, rank);
			mAns[i] = id + 1;
//			mOut.println("rank = " + rank + ", id = " + id);
			update(1, 0, mN - 1, id);
		}
		
		for (i = 0; i < mN; i++) {
			mOut.print(mAns[i]);
			mOut.print(" ");
		}
		mOut.println();
	}
	
	public void solve() {
		int T;
		int N;
		
		T = mFScanner.nextInt();
		
		while(T-- > 0) {
			N = mFScanner.nextInt();
			
			for (int i = 0; i < N; i++) {
				mArray[i] = mFScanner.nextInt();
			}
			
			mN = N;
			mMax = N + 2;
			solveTestCaseSeg();
		}
		
		close();
	}
	
	public void close() {
		mOut.flush();
		mOut.close();
	}
	
	public static void main(String [] args) {
		Main mSol = new Main();
		mSol.solve();
	}
}

class FasterScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;

	public FasterScanner() {
		this(System.in);
	}

	public FasterScanner(InputStream is) {
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