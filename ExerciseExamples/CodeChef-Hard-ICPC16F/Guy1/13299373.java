
import java.util.*;
import java.io.*;

/**
 *
 * @author usquare
 */

class Problem{
    
    public static int mod = (int) (1e9+7);
    public static InputReader in;
    public static PrintWriter out;
    
    public static void solve() throws FileNotFoundException {
 
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);            
        
        int t=in.ni();
        
        while(t-->0){
            int n=in.ni();
            int m=in.ni();
            int d=in.ni();
            int D=in.ni();
            
            int t1=m/n;
            int t2=(int) Math.ceil((m*1.0)/(n*1.0));

            if(t1<d || t2>D) out.println(-1);
            else{
                HashSet<Integer>[] g=new HashSet[n+1];
                int[] last=new int[n+1];
                for(int i=1;i<=n;i++){
                    last[i]=i-1;
                    g[i]=new HashSet<>();
                }
                int j=1;
                while(m>0){
                    last[j]++;
                    if(last[j]>n) last[j]=1;
                    g[j].add(last[j]);
                    j++;
                    if(j>n) j=1;
                    m--;
                    //debug(g);
                }
                for(int i=1;i<=n;i++){
                    for(int v:g[i])
                        out.println(i+" "+v);
                }
            }
        }
        
        out.close();
    }
    
    public static void main(String[] args) {
        new Thread(null ,new Runnable(){
            public void run(){
                try{
                    solve();
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        },"1",1<<26).start();
    }
    
    static class Pair implements Comparable<Pair>{

        String s;
        int x,y;
	Pair (int x,int y){
		this.x=x;
		this.y=y;
	}
        
	public int compareTo(Pair o) {
            return Integer.compare(this.x, o.x);
		//return 0;
	}

        @Override
        public String toString() {
            return x+" "+y;
        }
        
    
    } 

    public static long add(long a,long b){
        long x=(a+b);
        while(x>=mod) x-=mod;
        return x;
    }

    public static long sub(long a,long b){
        long x=(a-b);
        while(x<0) x+=mod;
        return x;
    }
    
    public static long mul(long a,long b){
        long x=(a*b)%mod;
        while(x<0) x+=mod;
        return x;
    }
    
    public static boolean isPal(String s){
        for(int i=0, j=s.length()-1;i<=j;i++,j--){
                if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
    public static String rev(String s){
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
    }
    
    public static long gcd(long x,long y){
	if(x%y==0)
		return y;
	else
		return gcd(y,x%y);
    }
    
    public static int gcd(int x,int y){
	if(x%y==0)
		return y;
	else 
		return gcd(y,x%y);
    }
    
    public static long gcdExtended(long a,long b,long[] x){
        
        if(a==0){
            x[0]=0;
            x[1]=1;
            return b;
        }
        long[] y=new long[2];
        long gcd=gcdExtended(b%a, a, y);
        
        x[0]=y[1]-(b/a)*y[0];
        x[1]=y[0];
        
        return gcd;
    }
    

    public static long mulmod(long  a,long b,long m) {
        if (m <= 1000000009) return a * b % m;
 
        long res = 0;
        while (a > 0) {
            if ((a&1)!=0) {
                res += b;
                if (res >= m) res -= m;
            }
            a >>= 1;
            b <<= 1;
            if (b >= m) b -= m;
        }
        return res;
    }
    
    public static int abs(int a,int b){
	return (int)Math.abs(a-b);
    }

    public static long abs(long a,long b){
	return (long)Math.abs(a-b);
    }
    
    public static int max(int a,int b){
	if(a>b)
		return a;
	else
		return b;
    }

    public static int min(int a,int b){
	if(a>b)
		return b;
	else 
		return a;
    }
    
    public static long max(long a,long b){
	if(a>b)
		return a;
	else
		return b;
    }

    public static long min(long a,long b){
	if(a>b)
		return b;
	else 
		return a;
    }

    public static long pow(long n,long p,long m){
	 long  result = 1;
	  if(p==0)
	    return 1;
	if (p==1)
	    return n;
	while(p!=0)
	{
	    if(p%2==1)
	        result *= n;
	    if(result>=m)
	    result%=m;
	    p >>=1;
	    n*=n;
	    if(n>=m)
	    n%=m;
	}
	return result;
    }
    
    public static long pow(long n,long p){
	long  result = 1;
	  if(p==0)
	    return 1;
	if (p==1)
	    return n;
	while(p!=0)
	{
	    if(p%2==1)
	        result *= n;	    
	    p >>=1;
	    n*=n;	    
	}
	return result;
    }
     public static void debug(Object... o) {
            System.out.println(Arrays.deepToString(o));
    }
     
    static class InputReader {
    
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
                this.stream = stream;
        }

        public int snext() {
                if (snumChars == -1)
                        throw new InputMismatchException();
                if (curChar >= snumChars) {
                        curChar = 0;
                        try {
                                snumChars = stream.read(buf);
                        } catch (IOException e) {
                                throw new InputMismatchException();
                        }
                        if (snumChars <= 0)
                                return -1;
                }
                return buf[curChar++];
        }

        public int ni() {
                int c = snext();
                while (isSpaceChar(c)) {
                        c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                        sgn = -1;
                        c = snext();
                }
                int res = 0;
                do {
                        if (c < '0' || c > '9')
                                throw new InputMismatchException();
                        res *= 10;
                        res += c - '0';
                        c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
        }

        public long nl() {
                int c = snext();
                while (isSpaceChar(c)) {
                        c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                        sgn = -1;
                        c = snext();
                }
                long res = 0;
                do {
                        if (c < '0' || c > '9')
                                throw new InputMismatchException();
                        res *= 10;
                        res += c - '0';
                        c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
        }

        public int[] nextIntArray(int n) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = ni();
                }
                return a;
        }

        public long[] nextLongArray(int n) {
                long a[] = new long[n];
                for (int i = 0; i < n; i++) {
                        a[i] = nl();
                }
                return a;
        }

        public String readString() {
                int c = snext();
                while (isSpaceChar(c)) {
                        c = snext();
                }
                StringBuilder res = new StringBuilder();
                do {
                        res.appendCodePoint(c);
                        c = snext();
                } while (!isSpaceChar(c));
                return res.toString();
        }

        public String nextLine() {
                int c = snext();
                while (isSpaceChar(c))
                        c = snext();
                StringBuilder res = new StringBuilder();
                do {
                        res.appendCodePoint(c);
                        c = snext();
                } while (!isEndOfLine(c));
                return res.toString();
        }

        public boolean isSpaceChar(int c) {
                if (filter != null)
                        return filter.isSpaceChar(c);
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
                return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
                public boolean isSpaceChar(int ch);
        }
        
    }
}    

