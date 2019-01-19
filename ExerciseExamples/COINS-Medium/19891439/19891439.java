import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    private static HashMap<Long, Long> map = new HashMap<>();
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            long n = s.nextLong();
            out.println(recurse(n));
        }
        out.close();
    }

    private static long recurse(long n){
        if(n==1) return 1;
        else if(n==0) return 0;
        long a,b,c;
        if(map.containsKey(n/2)){
            a = map.get(n/2);
        }else{
            a = recurse(n/2);
            map.put(n/2,a);
        }
        if(map.containsKey(n/3)){
            b = map.get(n/3);
        }else{
            b = recurse(n/3);
            map.put(n/3,b);
        }
        if(map.containsKey(n/4)){
            c = map.get(n/4);
        }else{
            c = recurse(n/4);
            map.put(n/4,c);
        }
        return Math.max(n, a+b+c);
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