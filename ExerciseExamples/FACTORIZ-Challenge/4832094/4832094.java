import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by andrew on 10.9.14.
 */
public class Main {

    static long[] primes2 = new long[1000005];
    static int prCnt = 0;
    static boolean[] pm = new boolean[1000005];

    public static void main(String[] args) {

        for (long i = 2; i < 300000; i++) {
            if (pm[(int) i])
                continue;
            primes2[prCnt++] = i;
            for (long j = i * i; j < 300000; j += i) {
                pm[(int) j] = true;
            }
        }

        try {


            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader in = new BufferedReader(new FileReader("a.in"));
            PrintWriter out = new PrintWriter(System.out);

            long start = System.currentTimeMillis();
            solve(in, out);
            long end = System.currentTimeMillis();
            out.println("time: " + ((end - start) / 1000.0));
            out.close();
            //in.close();
        } catch (Exception e) {

        }
    }

    public static void solve(BufferedReader in, PrintWriter out) throws IOException {
        int n = Integer.parseInt(in.readLine());

        TestCase[] cases = new TestCase[n];

        for (int i = 0; i < n; i++) {
            cases[i] = new TestCase(i);
            cases[i].read(in);
        }

        for (int i = 0; i < n; i++) {
            cases[i].solveLong(0, 650);
        }

        Arrays.sort(cases, new Comparator<TestCase>() {
            @Override
            public int compare(TestCase o1, TestCase o2) {
                return o2.ans.size() - o1.ans.size();
            }
        });

        for (int i = 0; i < 25; i++) {
            cases[i].solveLong(650, 19000);
        }

        Arrays.sort(cases, new Comparator<TestCase>() {
            @Override
            public int compare(TestCase o1, TestCase o2) {
                return o1.idx - o2.idx;
            }
        });

        double score = 0.0;
        for (int i = 0; i < n; i++) {
            cases[i].printAns(out);
            score += cases[i].ans.size() * cases[i].ans.size();
        }

        out.println("score: " + score);
    }

    public static class TestCase {
        public BigInteger x;
        public Vector<BigInteger> ans;
        public int idx;

        public TestCase(int _idx) {
            idx = _idx;
            ans = new Vector<BigInteger>();
        }

        public void read(BufferedReader in) throws IOException {
            x = new BigInteger(in.readLine());
        }

        public void solve(int lowerBound, int upperBound) {
            for (int i = lowerBound; i < upperBound; i++) {
                int j = i;
                BigInteger bmod = BigInteger.ONE;
                double sumLog = 0.0;
                while (j < upperBound) {
                    sumLog += Math.log10(primes2[j]);

                    if (sumLog < 100) {
                        bmod = bmod.multiply(BigInteger.valueOf(primes2[j]));
                        j++;
                    } else {
                        break;
                    }
                }


                while (true) {
                    boolean any = false;
                    BigInteger rem = x.remainder(bmod);
                    BigInteger toDiv = BigInteger.ONE;

                    for (int h = i; h < j; h++) {
                        if (rem.mod(BigInteger.valueOf(primes2[h])).signum() == 0) {
                            toDiv = toDiv.multiply(BigInteger.valueOf(primes2[h]));
                            ans.add(BigInteger.valueOf(primes2[h]));
                        }
                    }

                    if (toDiv.compareTo(BigInteger.ONE) > 0) {
                        x = x.divide(toDiv);
                    } else {
                        break;
                    }
                }

                i = j - 1;
            }
        }

        public void solveLong(int lowerBound, int upperBound) {
            for (int i = lowerBound; i < upperBound; i++) {
                int j = i;
                long mod = 1;

                while (j < upperBound) {

                    if (1e18 / primes2[i] >= mod) {
                        mod *= primes2[j];
                        j++;
                    } else {
                        break;
                    }
                }

                BigInteger bmod = BigInteger.valueOf(mod);

                while (true) {
                    boolean any = false;
                    long rem = x.remainder(bmod).longValue();
                    BigInteger toDiv = BigInteger.ONE;

                    for (int h = i; h < j; h++) {
                        if (rem % primes2[h] == 0) {
                            toDiv = toDiv.multiply(BigInteger.valueOf(primes2[h]));
                            ans.add(BigInteger.valueOf(primes2[h]));
                        }
                    }

                    if (toDiv.compareTo(BigInteger.ONE) > 0) {
                        x = x.divide(toDiv);
                    } else {
                        break;
                    }
                }

                i = j - 1;
            }
        }

        public void printAns(PrintWriter out) {
            if (x.compareTo(BigInteger.ONE) > 0) {
                if (x.compareTo(BigInteger.valueOf(1000000000000000000L)) < 0) {
                    long res = x.longValue();
                    long lo = Math.max(1, (long)Math.sqrt(res));
                    long hi = lo + 100;
                    while (hi - lo > 1) {
                        long mid = (lo + hi) >> 1;
                        if (mid * mid <= res) {
                            lo = mid;
                        } else {
                            hi = mid;
                        }
                    }
                    if (lo * lo == res) {
                        ans.add(BigInteger.valueOf(lo));
                        ans.add(BigInteger.valueOf(lo));
                    } else {
                        ans.add(x);
                    }
                } else {
                    ans.add(x);
                }
            }

            out.println(ans.size());
            for (BigInteger x : ans) {
                out.println(x);
            }
        }
    }




    static BigInteger pPlusOne(BigInteger n) {
        BigInteger b = BigInteger.valueOf(rnd.nextInt());
        for (int i = 1; i <= 50; i++) {
            BigInteger x = b;
            BigInteger y = b.multiply(b).subtract(BigInteger.valueOf(2)).mod(n);
            int ms = 0;
            for (int j = 8; j >= 0; j--) {
                if ((i & (1 << j)) != 0) {
                    ms = j;
                    break;
                }
            }

            for (int j = ms - 1; j >= 0; j--) {
                if (true || (i & (1 << j)) != 0) {
                    x = x.multiply(y).subtract(b).mod(n);
                    y = y.multiply(y).subtract(BigInteger.valueOf(2)).mod(n);
                } else {
                    y = x.multiply(y).subtract(b).mod(n);
                    x = x.multiply(x).subtract(BigInteger.valueOf(2)).mod(n);
                }
            }


            b = x;
        }
        if (n.gcd(b.subtract(BigInteger.valueOf(2).mod(n))).compareTo(BigInteger.ONE) != 0) {
            return n.gcd(b.subtract(BigInteger.valueOf(2).mod(n)));
        }

        return BigInteger.ZERO;
    }

    static class GP {
        BigInteger x, y, d;

        public GP() {
            x = BigInteger.ZERO;
            y = BigInteger.ONE;
            d = BigInteger.ZERO;
        }

        public GP(BigInteger _x, BigInteger _y, BigInteger _d) {
            x = _x;
            y = _y;
            d = _d;
        }

        public GP add(GP q, BigInteger n, BigInteger a) {
            if (d.compareTo(BigInteger.ONE) != 0) {
                if (y.compareTo(BigInteger.ONE) == 0) {
                    return q;
                }
                return this;
            }

            if (q.d.compareTo(BigInteger.ONE) != 0) {
                if (q.y.compareTo(BigInteger.ONE) == 0) {
                    return this;
                }
                return q;
            }

            if (x.compareTo(q.x) == 0 && y.compareTo(q.y.negate().mod(n)) == 0) {
                return new GP(BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO);
            }

            BigInteger m;

            if (x.compareTo(q.x) == 0 && y.compareTo(q.y) == 0) {
                if (y.gcd(n).compareTo(BigInteger.ONE) != 0) {
                    return new GP(BigInteger.ZERO, BigInteger.ZERO, y);
                }
                m = BigInteger.valueOf(3).multiply(x).multiply(x).add(a)
                        .multiply(BigInteger.valueOf(2).modInverse(n))
                        .multiply(y.modInverse(n))
                        .mod(n);
            } else {
                if (q.x.subtract(x).mod(n).gcd(n).compareTo(BigInteger.ONE) != 0) {
                    return new GP(BigInteger.ZERO, BigInteger.ZERO, q.x.subtract(x).mod(n));
                }

                m = q.y.subtract(y).mod(n)
                        .multiply(q.x.subtract(x).mod(n).modInverse(n))
                        .mod(n);
            }

            BigInteger t = m.multiply(m).subtract(x).subtract(q.x).mod(n);
            return new GP(t, m.multiply(x.subtract(t)).subtract(y).mod(n), BigInteger.ONE);
        }

        static GP pow(int e, BigInteger n, GP x, BigInteger a) {
            GP res = new GP();
            while (e > 0) {
                if (e % 2 == 1) {
                    res = x.add(res, n, a);
                }

                x = x.add(x, n, a);
                e >>= 1;
            }
            return res;
        }
    }

    ;

    static Random rnd;

    static {
        rnd = new Random();
    }

    static BigInteger lenstra(BigInteger n) {

        if (n.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ZERO;
        }

        if (n.isProbablePrime(5)) {
            return BigInteger.ZERO;
        } else if (n.mod(BigInteger.valueOf(2)).signum() == 0) {
            return BigInteger.valueOf(2);
        } else if (n.mod(BigInteger.valueOf(3)).signum() == 0) {
            return BigInteger.valueOf(3);
        }


        for (int i = 1; i < 5; i++) {
            BigInteger a = BigInteger.valueOf(rnd.nextLong()).mod(n);
            if (BigInteger.valueOf(4).multiply(a).multiply(a).multiply(a)
                    .add(BigInteger.valueOf(27)).mod(n).signum() == 0) {
                continue;
            }

            GP p = new GP(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE);

            for (int j = 1; j < 15; j++) {
                p = GP.pow(j + 1, n, p, BigInteger.valueOf(i));
                if (p.d.signum() == 0) {
                    break;
                }

                if (p.d.compareTo(BigInteger.ONE) > 0) {
                    return n.gcd(p.d);
                }
            }
        }

        return BigInteger.ZERO;
    }

    public static Vector<BigInteger> pollard(BigInteger n) {
        Vector<BigInteger> res = new Vector<BigInteger>();
        Queue<BigInteger> q = new LinkedList<BigInteger>();

        q.add(n);

        while (!q.isEmpty()) {
            BigInteger m = q.poll();

            BigInteger x = BigInteger.valueOf(2);
            BigInteger y = BigInteger.valueOf(2);
            BigInteger d = BigInteger.valueOf(1);

            if (m.isProbablePrime(20)) {
                res.add(m);
                continue;
            }

            for (int i = 0; d.compareTo(BigInteger.ONE) == 0; i++) {
                x = x.multiply(x).subtract(BigInteger.ONE).add(m).mod(m);
                y = y.multiply(y).subtract(BigInteger.ONE).add(m).mod(m);
                y = y.multiply(y).subtract(BigInteger.ONE).add(m).mod(m);
                d = x.subtract(y).abs().gcd(m);
            }

            // d = d.gcd(m);

            if (d.compareTo(m) == 0 || d.compareTo(BigInteger.ONE) == 0) {
                res.add(m);
            } else {
                q.add(d);
                q.add(m.divide(d));
            }
        }

        return res;
    }
}
