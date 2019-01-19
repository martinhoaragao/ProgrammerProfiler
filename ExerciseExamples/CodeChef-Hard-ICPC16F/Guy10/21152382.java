/*///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///   █████╗ ██╗   ██╗████████╗██╗  ██╗ ██████╗ ██████╗        ███████╗██╗  ██╗ █████╗ ██████╗ ██╗   ██╗  ///
///  ██╔══██╗██║   ██║╚══██╔══╝██║  ██║██╔═══██╗██╔══██╗██╗    ██╔════╝██║  ██║██╔══██╗██╔══██╗╚██╗ ██╔╝  ///
///  ███████║██║   ██║   ██║   ███████║██║   ██║██████╔╝╚═╝    ███████╗███████║███████║██║  ██║ ╚████╔╝   ///
///  ██╔══██║██║   ██║   ██║   ██╔══██║██║   ██║██╔══██╗██╗    ╚════██║██╔══██║██╔══██║██║  ██║  ╚██╔╝    ///
///  ██║  ██║╚██████╔╝   ██║   ██║  ██║╚██████╔╝██║  ██║╚═╝    ███████║██║  ██║██║  ██║██████╔╝   ██║     ///
///  ╚═╝  ╚═╝ ╚═════╝    ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝       ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝    ╚═╝     ///
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////*/

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

class Main {
    //private static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
    private static Reader in;
    private static PrintWriter out;
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int min(int... a){int min=a[0]; for(int i:a) min=Math.min(min, i); return min;}
    private static int max(int... a){int max=a[0]; for(int i:a) max=Math.max(max, i); return max;}
    private static long min(long... a){long min=a[0]; for(long i:a)min=Math.min(min, i); return min;}
    private static long max(long... a){long max=a[0]; for(long i:a)max=Math.max(max, i); return max;}
    private static String strm(String str, long m) {
        String ans="";
        while(m>0) {
            if(m%2==1) ans=ans.concat(str);
            str=str.concat(str); m>>=1;
        } return ans;
    }
    private static long mod(long a, long mod) {long res = a%mod; return res>=0 ? res : res+mod;}
    private static int mod(int a, int mod) {int res = a%mod; return res>=0 ? res : res+mod;}
    private static long modpow(long x, int n, int mod) {
        long res = 1;
        for (long p = x; n > 0; n >>= 1, p = mod((mod(p, mod)*mod(p, mod)),  mod)) {
            if ((n & 1) != 0) res = mod(mod(res, mod) * mod(p, mod), mod);
        }
        return res;
    }
    private static long gcd(long a, long b) {return b == 0 ? Math.abs(a) : gcd(b, a % b);}
    private static int gcd(int a, int b) {return b == 0 ? Math.abs(a) : gcd(b, a % b);}
    private static long gcd(long... a) {long gcd=a[0]; for(long x:a) gcd=gcd(gcd, x); return gcd;}
    private static int gcd(int... a) {int gcd=a[0]; for(int x:a) gcd=gcd(gcd, x); return gcd;}
    private static class Pair {
        public int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return this.x + " " + this.y;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Pair)) return false;
            Pair pair = (Pair)obj;
            return this.x == pair.x && this.y == pair.y;
        }

        @Override
        public int hashCode() {
            return (this.x+" "+this.y).hashCode();
        }
    }
    private static class Triplet {
        public int x, y, z;
        public Triplet(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Triplet)) return false;
            Triplet triplet = (Triplet)obj;
            return this.x == triplet.x && this.y == triplet.y && this.z == triplet.z;
        }

        @Override
        public int hashCode() {
            return (this.x+" "+this.y+" "+this.z).hashCode();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    static class Reader {
        private BufferedReader br;
        private StringTokenizer token;
        protected Reader(FileReader obj) {
            br = new BufferedReader(obj, 32768);
            token = null;
        }
        protected Reader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
            token = null;
        }
        protected String next() {
            while(token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (Exception e) {e.printStackTrace();}
            } return token.nextToken();
        }
        protected String nextLine() {
            String str="";
            try {
                str = br.readLine();
            } catch (Exception e) {e.printStackTrace();}
            return str;
        }
        protected int nextInt() {return Integer.parseInt(next());}
        protected long nextLong() {return Long.parseLong(next());}
        protected double nextDouble() {return Double.parseDouble(next());}
        protected long[] nextLongArr(int n) {
            long[] arr = new long[n]; for(int i=0; i<n; i++) arr[i] = nextLong(); return arr;
        }
        protected int[] nextIntArr(int n) {
            int[] arr = new int[n]; for(int i=0; i<n; i++) arr[i] = nextInt(); return arr;
        }
    }
    private static void solve() {
        int t = in.nextInt();
        next: while (t-->0) {
            int n = in.nextInt(), m = in.nextInt(), d = in.nextInt(), D = in.nextInt();
            int[] l = new int[n]; int[] r = new int[n];
            if (!(n*d <= m && m <= n*D)) {out.printf("%d\n", -1); continue next;}
            ArrayList<Pair> al = new ArrayList<>();
            int j = -1;
            jump: while (m>0) {
                j++; j = mod(j, n);
                for (int v=0; v<n; v++) {
                    l[v]++; r[mod(v+j, n)]++; m--;
                    al.add(new Pair(v+1, 1+mod(v + j, n)));
                    if (m == 0) break jump;
                }
            }
            for (int i=0; i<n; i++) {
                if (d > l[i] || l[i] > D || d>r[i] || D<r[i]) {out.printf("%d\n", -1); continue next;}
            }
            for (Pair p: al) out.printf("%s\n", p.toString());
        }
    }
    private static void run() throws Exception
    {
        in = new Reader();
//        in = new Reader(new FileReader("input.txt"));
//        out = new PrintWriter(new FileWriter("output.txt"));
        //in = oj ? new Reader() : new Reader(new FileReader("C:\\Users\\Suhaib\\Desktop\\input.txt"));
        out = new PrintWriter(System.out);
        //long ti = System.currentTimeMillis();
        solve();
        out.flush();
        //if (!oj) System.out.println("\n"+(System.currentTimeMillis()-ti)+"ms");
    }
    public static void main(String[] args) throws Exception {run();}
}