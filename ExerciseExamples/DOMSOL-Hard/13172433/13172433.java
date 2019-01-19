import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        int N = in.nextInt();
        int[][] grid = new int[2][N];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < N; j++)
                grid[i][j] = in.nextInt();

        int[] dp = new int[N + 1];
        dp[1] = Math.abs(grid[0][0] - grid[1][0]);

        for (int i = 2; i <= N; i++) {
            dp[i] = Math.max(
                    dp[i - 1] + Math.abs(grid[0][i - 1] - grid[1][i - 1]),
                    Math.abs(grid[0][i - 1] - grid[0][i - 2]) + Math.abs(grid[1][i - 1] - grid[1][i - 2]) + dp[i - 2]
            );
        }

        System.out.println(dp[N]);
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
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

        public String next() {
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

        private boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            boolean isSpaceChar(int ch);
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
    }
}