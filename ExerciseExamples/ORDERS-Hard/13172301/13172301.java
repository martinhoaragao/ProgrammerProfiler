import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    private static int[] st;
    private static int position;

    private static void build(int idx, int l, int r) {
        if (l == r) {
            st[idx] = 1;
            return;
        }

        int mid = l + (r - l) / 2;
        build(idx * 2 + 1, l, mid);
        build(idx * 2 + 2, mid + 1, r);
        st[idx] = st[idx * 2 + 1] + st[idx * 2 + 2];
    }

    private static void update(int idx, int l, int r, int value) {
        if (l == r) {
            st[idx] = 0;
            position = l;
            return;
        }

        int mid = l + (r - l) / 2;
        if (st[idx * 2 + 1] >= value) update(idx * 2 + 1, l, mid, value);
        else update(idx * 2 + 2, mid + 1, r, value - st[idx * 2 + 1]);
        st[idx] = st[idx * 2 + 1] + st[idx * 2 + 2];
    }

    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        int T = in.readInt();
        while (T-- > 0) {
            int N = in.readInt();
            int[] w = new int[N];
            for (int i = 0; i < N; i++) w[i] = in.readInt();

            int treeHeight = (int) Math.ceil(Math.log(N) / Math.log(2.0));
            int maxTreeSize = (int) Math.pow(2, treeHeight + 1) - 1;
            st = new int[maxTreeSize];

            build(0, 0, N - 1);
            int[] rank = new int[N];
            for (int i = N - 1; i >= 0; i --) {
                update(0, 0, N - 1, i - w[i] + 1);
                rank[i] = position + 1;
            }

            StringBuilder sb = new StringBuilder();
            for (int i=0;i<N;i++) {
                if (i != 0) sb.append(" ");
                sb.append(rank[i]);
            }
            System.out.println(sb);
        }
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

        public String readString() {
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

        public interface SpaceCharFilter {
            boolean isSpaceChar(int ch);
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
    }
}