import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.math.BigInteger;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author Nipuna Samarasekara
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		FastPrinter out = new FastPrinter(outputStream);
		CC1 solver = new CC1();
		solver.solve(1, in, out);
		out.close();
	}
}
 
class CC1 {
    /////////////////////////////////////////////////////////////
 
    public void solve(int testNumber, FastScanner in, FastPrinter out) {
     int n=in.nextInt();
        int[] primes= MathUtils.genPrimes(20000);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ans= new ArrayList<Integer>();
            BigInteger b= new BigInteger(in.next());
            for (int j = 0; j < primes.length; j++) {
                if(b.equals(BigInteger.ONE))break;
                while (b.mod(BigInteger.valueOf(primes[j])).equals(BigInteger.ZERO)){
                    ans.add(primes[j]);
                    b=b.divide(BigInteger.valueOf(primes[j]));
                }
            }
            int sz=ans.size();
            if(!b.equals(BigInteger.ONE))sz++;
            out.println(sz);
            for (Integer an : ans) {
                out.println(an);
            }
            if(!b.equals(BigInteger.ONE)) out.println(b);
        }
    }
}
 
class FastScanner extends BufferedReader {
 
    public FastScanner(InputStream is) {
        super(new InputStreamReader(is));
    }
 
    public int read() {
        try {
            int ret = super.read();
//            if (isEOF && ret < 0) {
//                throw new InputMismatchException();
//            }
//            isEOF = ret == -1;
            return ret;
        } catch (IOException e) {
            throw new InputMismatchException();
        }
    }
 
    public String next() {
        StringBuilder sb = new StringBuilder();
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c < 0) {
            return null;
        }
        while (c >= 0 && !isWhiteSpace(c)) {
            sb.appendCodePoint(c);
            c = read();
        }
        return sb.toString();
    }
 
    static boolean isWhiteSpace(int c) {
        return c >= 0 && c <= 32;
    }
 
    public int nextInt() {
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int ret = 0;
        while (c >= 0 && !isWhiteSpace(c)) {
            if (c < '0' || c > '9') {
                throw new NumberFormatException("digit expected " + (char) c
                        + " found");
            }
            ret = ret * 10 + c - '0';
            c = read();
        }
        return ret * sgn;
    }
 
    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            return null;
        }
    }
 
}
 
class FastPrinter extends PrintWriter {
 
    public FastPrinter(OutputStream out) {
        super(out);
    }
 
    public FastPrinter(Writer out) {
        super(out);
    }
 
 
}
 
class MathUtils {
 
 
    public static int[] genPrimes(int n) {
        boolean[] isPrime = genPrimesBoolean(n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        int[] primes = new int[count];
        for (int i = 0, j = 0; i < n; i++) {
            if (isPrime[i]) {
                primes[j++] = i;
            }
        }
        return primes;
    }
 
    public static boolean[] genPrimesBoolean(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
 
}
 