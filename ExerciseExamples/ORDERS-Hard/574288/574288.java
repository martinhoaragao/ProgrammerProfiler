import java.io.*;
import java.math.*;
import java.util.*;

/**
 * @author Thomas Dybdahl Ahle (thomas@ahle.dk)
 *         Created on 14.06.2011
 */
public class Main implements Runnable {
	private InputReader in;
	private PrintWriter out;
	private static final int INF = 1000000000;

	public static void main(String[] args) {
		new Main().run();
	}

	public Main() {
		in = new InputReader(System.in);
		out = new PrintWriter(System.out);
	}
	
	abstract class Treap {
	    int size;
	    abstract Treap addFromRight(int x, int k);
	    abstract void fill(int[] ar, int from);
	}
	class Fork extends Treap {
	    Treap left, right;
	    double pri;
	    Fork (Treap left, Treap right, double pri) {
	        this.left = left;
	        this.right = right;
	        size = left.size + right.size;
	        this.pri = pri;
	    }
	    void fill(int[] ar, int from) {
	        left.fill(ar, from);
	        right.fill(ar, from+left.size);
	    }
	    Treap addFromRight(int x, int k) {
	        assert k >= 0 && k <= left.size+right.size;
	        if (k <= right.size) return balanceRight(left, (Fork)right.addFromRight(x, k));
	        return balanceLeft((Fork)left.addFromRight(x, k-right.size), right);
	    }
	    Treap balanceLeft(Fork left, Treap right) {
	        if (left.pri > pri) return new Fork(left, right, pri);
	        return new Fork(left.left, new Fork(left.right, right, pri), left.pri);
	    }
	    Treap balanceRight(Treap left, Fork right) {
	        if (right.pri > pri) return new Fork(left, right, pri);
	        return new Fork(new Fork(left, right.left, pri), right.right, right.pri);
	    }
	}
	class Node extends Treap {
	    int x;
	    Node (int x) {
	        this.x = x;
	        size = 1;
	    }
	    void fill(int[] ar, int from) {
	        ar[from] = x;
	    }
	    Treap addFromRight(int x, int k) {
	        assert k == 0 || k == 1;
	        if (k == 0) return new Fork(this, new Node(x), Math.random());
	        return new Fork(new Node(x), this, Math.random());
	    }
	}
	
	public void run() {
        int numTests = in.readInt();
        for (int testNumber = 0; testNumber < numTests; testNumber++) {
            int N = in.readInt();
            
            Treap root = new Node(in.readInt()); // always 0
            for (int i = 1; i < N; i++)
                root = root.addFromRight(i, in.readInt());
            
        	int[] rank = new int[N];
        	root.fill(rank, 0);
        	int[] inv = new int[N];
        	for (int i = 0; i < N; i++) {
        	    inv[rank[i]] = i;
        	}
        	for (int i = 0; i < N; i++) {
        	    out.print(inv[i]+1);
        	    out.print(" ");
        	}
        	out.println();
        }
		out.close();
	}
	
	private static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1000];
		private int curChar, numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		private int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int readInt() {
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

		public long readLong() {
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

		public String readString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuffer res = new StringBuffer();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private String readLine0() {
			StringBuffer buf = new StringBuffer();
			int c = read();
			while (c != '\n' && c != -1) {
				buf.appendCodePoint(c);
				c = read();
			}
			return buf.toString();
		}

		public String readLine() {
			String s = readLine0();
			while (s.trim().length() == 0)
				s = readLine0();
			return s;
		}

		public String readLine(boolean ignoreEmptyLines) {
			if (ignoreEmptyLines)
				return readLine();
			else
				return readLine0();
		}

		public BigInteger readBigInteger() {
			try {
				return new BigInteger(readString());
			} catch (NumberFormatException e) {
				throw new InputMismatchException();
			}
		}

		public char readCharacter() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			return (char) c;
		}

		public double readDouble() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') {
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) {
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
	}
}