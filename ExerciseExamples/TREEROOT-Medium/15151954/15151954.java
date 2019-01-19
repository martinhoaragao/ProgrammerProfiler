import java.io.*;
import java.util.*;



class Solution {

    static Kattio kattio;
    static int[] numbs;
    static long MODVAL = 1000000007;
    static long lsum;


    static long nCr(int n, int r){
        long sum = 1L;

        if(r > n - r)
            r = n-r;
        for(int i=1; i<=r; i++){
            sum = (sum *  (n+1-i) )/ i;
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        kattio = new Kattio(System.in, System.out);
        int t = kattio.getInt();

        for(int x=0; x<t; x++) {
            int lsum = 0; int rsum = 0;
            int n = kattio.getInt();
            for(int i=0; i<n; i++){
                lsum = lsum + kattio.getInt();
                rsum = rsum + kattio.getInt();
            }
            kattio.println(lsum-rsum);
        }
        kattio.close();
    }
}


/**
 * Simple yet moderately fast I/O routines.
 * <p>
 * Example usage:
 * <p>
 * Kattio io = new Kattio(System.in, System.out);
 * <p>
 * while (io.hasMoreTokens()) {
 * int n = io.getInt();
 * double d = io.getDouble();
 * double ans = d*n;
 * <p>
 * io.println("Answer: " + ans);
 * }
 * <p>
 * io.close();
 * <p>
 * <p>
 * Some notes:
 * <p>
 * - When done, you should always do io.close() or io.flush() on the
 * Kattio-instance, otherwise, you may lose output.
 * <p>
 * - The getInt(), getDouble(), and getLong() methods will throw an
 * exception if there is no more data in the input, so it is generally
 * a good idea to use hasMoreTokens() to check for end-of-file.
 *
 * @author: Kattis
 */


class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }


    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) {
            }
        return token;
    }

    //Added for possibility to read entire line
    public String getLine() {
        try {
            return r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}