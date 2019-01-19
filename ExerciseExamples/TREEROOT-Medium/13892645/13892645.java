import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {


    HashMap<Integer,Integer> hm;
    Set<Integer> nodes;
    Set<Integer> used;
    int N;
    private void solve() throws IOException {

        int T = nextInt();
        for(int t = 0; t < T; ++t) {

            int N = nextInt();
            if(N == 1) {
                int id = nextInt();
                int val = nextInt();
                writer.println(id);
            } else {
                int[] a = new int[N];
                int[] b = new int[N];
                for(int i = 0; i < N; ++i) {
                    a[i] = nextInt();
                    b[i] = nextInt();
                }
                TreeSet<Integer> ts = new TreeSet<>();
                for(int i = 0; i < N; ++i) {
                    int A = 0;
                    int B = 0;
                    for(int j =0;j < N; ++j) {
                        if(j == i) {
                            B += b[j];
                        } else {
                            A += a[j];
                            B += b[j];
                        }
                    }
                    if(A == B) ts.add(a[i]);
                }
                for(int i : ts) {
                    writer.print(i + " " );
                }
                writer.println();
            }
        }

    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}