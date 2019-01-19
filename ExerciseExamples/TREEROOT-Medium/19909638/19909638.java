//package codechefPractice;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws Exception {
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int[] id = new int[n];
            int[] sum = new int[n];
            int count = 0;
            for(int i=0; i<n; i++){
                id[i] = scn.nextInt();
                sum[i] = scn.nextInt();
                count+= (id[i] - sum[i]);
            }
            out.println(count);
        }

        out.close();
    }

    public static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.nextInt();
            }
            return arr;
        }

        public Integer[] nextIntegerArr(int n) {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new Integer(this.nextInt());
            }
            return arr;
        }

        public int[][] next2DIntArr(int n, int m) {
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = this.nextInt();
                }
            }
            return arr;
        }

        public int[] nextSortedIntArr(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.nextInt();
            }
            Arrays.sort(arr);
            return arr;
        }

        public long[] nextLongArr(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.nextLong();
            }
            return arr;
        }

        public char[] nextCharArr(int n) {
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.nextChar();
            }
            return arr;
        }
    }

    public static InputReader scn = new InputReader();
    public static PrintWriter out = new PrintWriter(System.out);
}