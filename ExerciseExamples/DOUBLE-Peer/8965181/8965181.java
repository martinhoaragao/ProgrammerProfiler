
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public final class Main {

	public static void main(final String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		int t = sc.nextInt();
		int n;
		final StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			sb.append(((n = sc.nextInt()) & 1) == 0 ? n : n - 1).append("\n");
		}
		System.out.println(sb);
	}

	private static final class FastScanner {
		private final InputStream mIs;
		private final byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner() {
			this(System.in);
		}

		public FastScanner(final InputStream is) {
			this.mIs = is;
		}

		public int read() {
			if (this.numChars == -1) {
				throw new InputMismatchException();
			}
			if (this.curChar >= this.numChars) {
				this.curChar = 0;
				try {
					this.numChars = this.mIs.read(this.buf);
				} catch (final IOException e) {
					throw new InputMismatchException();
				}
				if (this.numChars <= 0) {
					return -1;
				}
			}
			return this.buf[this.curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			final StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c;
			while (isSpaceChar(c = read())) {
			}
			final StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextArray(final int n) {
			final int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public long[] nextLongArray(final int n) {
			final long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextLong();
			}
			return a;
		}

		public char[] nextCharArray(final int n) {
			final char[] buf = new char[n];
			int b, p = 0;
			while (isSpaceChar(b = read())) {
			}
			while (p < n && !isSpaceChar(b)) {
				buf[p++] = (char) b;
				b = read();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		public char[][] nextMatrix(final int n, final int m) {
			final char[][] map = new char[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextCharArray(m);
			}
			return map;
		}

		public int[][] nextIntMatrix(final int n, final int m) {
			final int[][] map = new int[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextArray(m);
			}
			return map;
		}

		public long[][] nextLongMatrix(final int n, final int m) {
			final long[][] map = new long[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextLongArray(m);
			}
			return map;
		}

		public boolean isSpaceChar(final int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(final int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}
}