import java.io.IOException;
import java.io.InputStream;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        InputReader reader = new InputReader(System.in);
        int N = reader.readInt();
        int[] top = new int[N];
        for (int n=0; n<N; n++) {
            top[n] = reader.readInt();
        }
        int[] bottom = new int[N];
        for (int n=0; n<N; n++) {
            bottom[n] = reader.readInt();
        }
        int[] dp = new int[N+1];
        dp[1] = Math.abs(top[0]-bottom[0]);
        for (int n=2; n<=N; n++) {
            int value1 = dp[n-1]+Math.abs(top[n-1]-bottom[n-1]);
            int value2 = dp[n-2]+Math.abs(top[n-2]-top[n-1])+Math.abs(bottom[n-2]-bottom[n-1]);
            dp[n] = Math.max(value1, value2);
        }
        System.out.println(dp[N]);
    }
 
    static final class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        private int read() throws IOException {
            if (curChar >= numChars) {
                curChar = 0;
                numChars = stream.read(buf);
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
 
        public final int readInt() throws IOException {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res;
        }
 
        public final long readLong() throws IOException {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res;
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
 
}
 