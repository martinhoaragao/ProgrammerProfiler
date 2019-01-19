//package codeforces;


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

class ChefandSubsequence {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
//        InputReader in = new InputReader(inputStream);
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAA solver = new TaskAA();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskAA {
    	static HashMap<Long,Long> memoize = new HashMap<>();
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        	memoize.put((long)0, (long)0);
        	memoize.put((long)1, (long)1);
        	while(in.hasNext()) {
        		long n = in.nextLong();
        		out.println(max(n));
        	}
        }
        public static long max(long n) {
        	if(memoize.containsKey(n))return memoize.get(n);
        	long ret = Math.max(n, max(n/2)+max(n/3)+max(n/4));
        	memoize.put((long)n, ret);
        	return ret;
        }
    }
    
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}     