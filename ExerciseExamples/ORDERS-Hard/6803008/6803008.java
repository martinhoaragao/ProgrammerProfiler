import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class Orders {

    private static final boolean TEST_CASES = true;


    private int[] idToMoves;
    private int[] idToRank;

    private void solve(InputReader io) {

        int n = io.nextInt();

        reset(n);

        for (int i = 0; i < n; i++) {
            idToMoves[i + 1] = io.nextInt();
        }

        for (int i = n; i > 0; --i) {
            int rank = SegTree.get(i - idToMoves[i]);
            idToRank[i] = rank;
            SegTree.update(rank);
        }

        for (int i = 1; i <= n; ++i) {
            io.writer.print(idToRank[i]);
            if (i < n) {
                io.writer.print(" ");
            }
        }
        io.writer.println();
    }


    private void reset(int n) {
        idToMoves = new int[n + 1];
        idToRank = new int[n + 1];
        SegTree.init(n);
    }


    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public PrintWriter writer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
            writer = new PrintWriter(System.out);
        }

        public String next() {
            checkTokenizer();
            return tokenizer.nextToken();
        }

        public void checkTokenizer() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public List<Integer> getAll() {
            List<Integer> tokens = new ArrayList<Integer>();
            checkTokenizer();
            while (tokenizer.hasMoreTokens()) {
                tokens.add(Integer.parseInt(tokenizer.nextToken()));
            }
            return tokens;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

    private void go(InputReader io) {

        int testCases = TEST_CASES ? io.nextInt() : 1;

        while (testCases > 0) {
            solve(io);
            testCases--;
        }

    }

    public static void main(String[] args) {
        InputReader io = new InputReader();
        new Orders().go(io);
        io.writer.flush();
    }
}

class SegTree {

    private static int sz;
    private static int[] freePlaceCount = new int[600001];


    public static void init(int n) {
        sz = n;
        init(1, 1, n);
    }

    private static void init(int i, int l, int r) {
        if (l == r) {
            freePlaceCount[i] = 1;
            return;
        }

        int left = i * 2;
        int right = left + 1;

        int mid = (l + r) / 2;

        init(left, l, mid);
        init(right, mid + 1, r);

        freePlaceCount[i] = freePlaceCount[left] + freePlaceCount[right];
    }

    public static int get(int count) {
        return get(1, 1, sz, count);
    }

    private static int get(int id, int l, int r, int count) {
        // base
        if (l == r) {
            return l;
        }

        int left = 2 * id;
        int right = left + 1;

        int mid = (l + r) / 2;

        if (freePlaceCount[left] >= count) {
            return get(left, l, mid, count);
        } else {
            return get(right, mid + 1, r, count - freePlaceCount[left]);
        }
    }

    public static void update(int pos) {

        update(1, 1, sz, pos);

    }

    private static void update(int id, int l, int r, int pos) {
        if (l == r) {
            freePlaceCount[id] = 0;
            return;
        }

        int left = 2 * id;
        int right = left + 1;

        int mid = (l + r) / 2;

        if (pos <= mid) {
            update(left, l, mid, pos);
        } else {
            update(right, mid + 1, r, pos);
        }

        freePlaceCount[id] = freePlaceCount[left] + freePlaceCount[right];
    }

}
