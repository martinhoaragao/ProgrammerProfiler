import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.InputMismatchException;

/**
 *
 * @author jigsaw
 */
class Factorisation {

    /**
     * @param args the command line arguments
     */
    static int prime[];
    static int n = 25000;
    public static void main(String[] args) {
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        OutputWriter outt = new OutputWriter(outputstream);
        int T = in.readInt();
        int size = 2762;
        
        prime = new int[100000];
        long start = System.currentTimeMillis();
     ///   System.out.println("here = "+prime[size-1]);
        pre();
        //for(int x:prime)
          //  System.out.print(x+" ,");
        
        while(T-->0){
            int arr[] = new int[50001];
            int z = 0;
            BigInteger N = new BigInteger(in.readString());
            
            for(int i=0;i<size&&N.compareTo(BigInteger.ZERO)==1;i++){
                int j = prime[i];
                while(z<50000&&N.compareTo(BigInteger.ZERO)==1&&N.mod(new BigInteger(""+j)).equals(BigInteger.ZERO)){
                    //System.out.println("where??");
                    //if(N.mod(new BigInteger(""+j)).equals(BigInteger.ZERO)){
                        N = N.divide(new BigInteger(""+j));
                        
                        arr[z++] = j;
                    //}
                    
                }
            }
            if(N.compareTo(BigInteger.ONE)==1)
                outt.printLine(z+1);
            else
                outt.printLine(z);
            for(int i=0;i<z;i++)
                outt.printLine(arr[i]);
            if(N.compareTo(BigInteger.ONE)==1)
                outt.printLine(N);
        }
        long end = System.currentTimeMillis();
        //outt.printLine("time = "+(end-start));
        outt.close();
    }
    static void pre(){
        boolean seive[] = new boolean[n];
        //seive[2] = true;
        for(int i=2;i<n;i++){
            if(!seive[i]){
                int j = i+i;
                while(j<n){
                    seive[j] = true;
                    j+=i;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++)
            if(!seive[i])
                prime[count++] = i;
       // System.out.println("count = "+count);
        
    }
    
}
class InputReader {
 
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private InputReader.SpaceCharFilter filter;
 
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
 
    public boolean isSpaceChar(int c) {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    public String next() {
        return readString();
    }
 
    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
}
 
class OutputWriter {
    private final PrintWriter writer;
 
    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
 
    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }
 
    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }
 
    public void printLine(Object...objects) {
        print(objects);
        writer.println();
    }
 
    public void close() {
        writer.close();
    }}

