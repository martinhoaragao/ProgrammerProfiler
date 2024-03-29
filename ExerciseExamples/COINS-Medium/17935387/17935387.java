import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.*;
 class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];

    private int curChar;

    private int numChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new RuntimeException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public String readString() {
        final StringBuilder stringBuilder = new StringBuilder();
        int c = read();
        while (isSpaceChar(c))
            c = read();
        do {
            stringBuilder.append(c);
            c = read();
        } while (!isSpaceChar(c));
        return stringBuilder.toString();
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long readLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}


class Test
{
    static HashMap<Long, Long> hm = new HashMap();
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            long n = scanner.nextLong();
            System.out.println(solve( n));
        }

    }

    public static long solve( long n)
    {

       if(n >= 12)
       {
            if(hm.get(n/2) == null)
                solve(n/2);

            if(hm.get(n/3) == null)
                solve(n/3);

           if(hm.get(n/4) == null)
                solve(n/4);

            long extendedSum = hm.get(n/2)+hm.get(n/3)+hm.get(n/4);

            if(extendedSum > n)
                hm.put(n, extendedSum);
            else
                hm.put(n, n);
       }

        else
        {
            hm.put(n, n);
        }
        return hm.get(n);
    }
}