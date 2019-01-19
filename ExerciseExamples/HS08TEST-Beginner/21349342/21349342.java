import java.io.*;
import java.util.*;

public class Main {
    static FastReader r = new FastReader();
    static PrintWriter p = new PrintWriter(new BufferedOutputStream(System.out), true);
	public static void main(String[] args) {
		int get = r.nextInt();
        int curr = Integer.parseInt(r.next().replace(".", ""));
        if (get%5 != 0 || get*100 + 50 > curr) {
            printMoney(curr);
            return;
        }
        curr -= get*100 + 50;
        printMoney(curr);
	}
    static void printMoney(int curr) {
        String str = String.valueOf(curr);
        int l = str.length();
        out(str.substring(0, l - 2) + "." + str.substring(l - 2, l));
    }
    private static void out(Object o) {
        out(o, true);
    }
	private static void out(Object o, boolean autoFlush) {
		p.print(o);
        if (autoFlush)
            p.flush();
	}
	private static void outln(Object o) {
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
                } catch (IOException  e) {
                    e.printStackTrace(); 
                }
            }
            return st.nextToken(); 
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