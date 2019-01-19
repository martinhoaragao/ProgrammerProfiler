import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);

        int T = in.readInt();
        int i, j, k;
        String N;
        BigInteger num, factor;
        int size = 28000;
        boolean isPrime[] = new boolean[size];
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        int countFactors;
        ArrayList<String> factorList;

        for (i = 0; i < size; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;

        for (i = 2; i < size; i++) {
            if (isPrime[i] == false)
                continue;
            for (j = 2 * i; j < size; j += i) {
                isPrime[j] = false;
            }
        }

        for (i = 2; i < size; i++) {
            if (isPrime[i] == true) {
                primeList.add(i);
            }
        }

        for (k = 0; k < T; k++) {
            N = in.readString();
            num = new BigInteger(N);
            countFactors = 0;
            factorList = new ArrayList<String>();

            for (i = 0; i < primeList.size(); i++) {
                factor = BigInteger.valueOf(primeList.get(i));
                while (num.compareTo(BigInteger.ONE) == 1
                        && num.remainder(factor).equals(BigInteger.ZERO)) {
                    countFactors++;
                    factorList.add("" + primeList.get(i));
                    num = num.divide(factor);

                    // if (countFactors == 100) {
                    // i = primeList.size();
                    // break;
                    // }
                }
            }

            if (num.compareTo(BigInteger.ONE) == 1) {
                countFactors++;
                factorList.add("" + num);
            }

            if (countFactors == 0) {
                out.printLine("1");
                out.printLine("" + N);
            } else {
                out.printLine("" + countFactors);
                for (i = 0; i < factorList.size(); i++) {
                    out.printLine("" + factorList.get(i));
                }
            }
        }
        out.close();
    }

    public static class InputReader {
        private InputStream stream;

        private byte[] buf = new byte[1024];

        private int curChar;

        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }
    }

    public static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(outputStream);
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }
    }
}