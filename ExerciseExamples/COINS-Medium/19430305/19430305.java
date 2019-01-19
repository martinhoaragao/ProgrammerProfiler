import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<Integer> B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        B = sc.readLines().stream().map(Integer::parseInt).collect(Collectors.toList());

        long[] answers = solve();
        PrintWriter pw = new PrintWriter(System.out);
        for (long answer : answers) {
            pw.println(answer);
        }
        pw.flush();
    }

    static long[] solve() {
        long[] answers = new long[B.size()];
        for (int i = 0; i < B.size(); i++) {
            answers[i] = dfs(B.get(i));
        }
        return answers;
    }

    static Map<Integer, Long> MEMO = new HashMap<>();
    static {
        MEMO.put(0, 0L);
    }

    static long dfs(int b) {
        if( MEMO.containsKey(b) ) {
            return MEMO.get(b);
        }

        int b2 = b/2;
        int b3 = b/3;
        int b4 = b/4;
        long d2 = dfs(b2);
        long d3 = dfs(b3);
        long d4 = dfs(b4);

        long ret = Math.max(b, Math.max(b2, d2) + Math.max(b3, d3) + Math.max(b4, d4));
        MEMO.put(b, ret);
        return ret;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public List<String> readLines() {
            List<String> values = new ArrayList<>();
            String line;
            while( (line = nextLine()) != null ) {
                values.add(line);
            }
            return values;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
