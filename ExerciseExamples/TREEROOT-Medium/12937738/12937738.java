import java.io.*;
import java.util.*;

// Java template
public class Main {

    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();

        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int root = 0;
            for (int i=0; i<N; ++i) {
                int id = in.nextInt();
                int sumChildren = in.nextInt();

                // idea: when we calculate sum(id - sum_child_ids) for all nodes, each node n will be cancelled out
                // except for the root node because:
                // * the id of n is added
                // * the id is subtracted when we subtract the sum of the children of n's parent
                root += id - sumChildren;
            }

            System.out.println(root);
        }
    }

    //-- Boilerplate below --

    // Stolen from: http://codeforces.com/blog/entry/7018
    private static class InputReader {
       
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        InputReader() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
