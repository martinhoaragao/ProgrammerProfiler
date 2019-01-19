
//@formatter:off
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Main {
	
	public static int maxIndex = 10000000;
	public static long[] ans = new long[maxIndex+1];
	public static void main(String[] args) throws Exception {
		InputReader1 r = new InputReader1(System.in);
		StringBuilder sb = new StringBuilder();
		int testcases = r.rInt();
		for(int test = 0; test < testcases; test++){
			String s = r.rString().trim();
			int n = s.length();
			int ans = 0;//ABCDEFGHIJKLMNOPQRSTUVWXYZ
			for(int i = 0; i < n; i++){
				char c = s.charAt(i);
				if(c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q' || c == 'R') ans++;
				if(c == 'B') ans += 2;
			}
			System.out.println(ans);
		}
	}
}

class InputReader1 {
	 
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader1(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
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

	public int rInt() {
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

	public String rString() {
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

	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return rString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}