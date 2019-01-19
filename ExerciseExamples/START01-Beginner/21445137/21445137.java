import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    static FastReader r = new FastReader();
    static PrintWriter p = new PrintWriter(new BufferedOutputStream(System.out), true);
    public static void main(String[] args) {
        outln(r.nextInt());
    }
    static void out(Object o) {
        out(o, true);
    }
    static void out(Object o, boolean autoFlush) {
        p.print(o);
        if (autoFlush)
            p.flush();
    }
    static void outln(Object o) {
        p.println(o);
    }
    static class FastReader {
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in)); 
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine()); 
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return st.nextToken(); 
        }
        char nextChar() {
            try {
                return (char)br.read();
            } catch (IOException e) {
                return '\0';
            }
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
        float nextFloat() {
            return Float.parseFloat(next()); 
        }
        String nextLine() {
            String str = ""; 
            try {
                str = br.readLine(); 
            }
            catch (IOException e) {
                e.printStackTrace(); 
            }
            return str; 
        }
        void close() {
            try {
                br.close();
            } catch (Exception e) {}
        }
    }
}