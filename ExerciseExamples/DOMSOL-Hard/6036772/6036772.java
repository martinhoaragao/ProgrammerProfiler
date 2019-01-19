

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

 class Task {

    public static void main(String[] args) {

        Thread t = new Thread(null, null, "Solution", 100000000) {

            @Override
            public void run() {
                InputStream inputstream = System.in;
                OutputStream outputstream = System.out;
                InputReader in = new InputReader(inputstream);
                PrintWriter out = new PrintWriter(outputstream);
                int T = 1;
                //        T = Integer.parseInt(in.readString());

                for (int i = 1; i <= T; i++) {
                    Solution solver = new Solution();
                    solver.solve(i, in, out);
                }
                out.close();
            }

        };
        t.start();

    }
}

class Solution {

    public void solve(int testno, InputReader in, PrintWriter out) {

        int N = in.readInt();

        int[] row1 = new int[N];
        int[] row2 = new int[N];

        for (int i = 0; i < N; i++) {
            row1[i] = in.readInt();
        }
        for (int i = 0; i < N; i++) {
            row2[i] = in.readInt();
        }

        int[] ans = new int[N];
        ans[0] = Math.abs(row1[0] - row2[0]);

        for (int i = 1; i < N; i++) {

            int get1 = ans[i - 1] + Math.abs(row1[i] - row2[i]);

            int take;
            if ((i - 2) < 0) {
                take = 0;
            } else {
                take = ans[i - 2];
            }

            int get2 = take + Math.abs(row1[i] - row1[i - 1]) + Math.abs(row2[i] - row2[i - 1]);

            ans[i] = Math.max(get1, get2);
        }

        out.println(ans[N - 1]);
    }
}

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

    public int readInt() {
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

    public String readString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuffer res = new StringBuffer();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public long readLong() {
        return Long.parseLong(readString());
    }

    public double readDouble() {
        return Double.parseDouble(readString());
    }

    public float readFloat() {
        return Float.parseFloat(readString());
    }

    public static boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}
