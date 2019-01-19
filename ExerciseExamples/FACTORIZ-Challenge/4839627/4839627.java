import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        int MAXN = 1000000;
        int sqrtN = (int)Math.sqrt(MAXN);
        boolean[] composite = new boolean[MAXN];
        composite[0] = composite[1] = true;
        for (int p=2; p<=sqrtN; p++) {
            if (!composite[p]) {
                for (int x=2*p; x<MAXN; x+=p) {
                    composite[x] = true;
                }
            }
        }
        int primeNo = 0;
        for (boolean b : composite) {
            if (!b) primeNo++;
        }
        int[] primes = new int[primeNo];
        BigInteger[] bigPrimes = new BigInteger[primeNo];
        primeNo = 0;
        int bigMax = 3000;
        int bigLimit = -1;
        for (int p=2; p<MAXN; p++) {
            if (!composite[p]) {
                if (p > bigMax && bigLimit == -1) {
                    bigLimit = primeNo;
                }
                bigPrimes[primeNo] = BigInteger.valueOf(p);
                primes[primeNo++] = p;
            }
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int T = Integer.parseInt(s);
        for (int t=0; t<T; t++) {
            s = reader.readLine();
            List<Number> divisors = new ArrayList<Number>();
            if (s.length() <= 18) {
                int limit = 2000000;
                long value = Long.parseLong(s);
                for (int p : primes) {
                    if (p > limit) break;
                    while (value%p == 0) {
                        divisors.add(p);
                        value /= p;
                    }
                    if (value == 1) break;
                }
                if (value != 1) {
                    divisors.add(value);
                }
            } else {
                BigInteger value = new BigInteger(s);
                for (int i=0; i<bigLimit; i++) {
                    BigInteger P = bigPrimes[i];
                    BigInteger[] fraction = value.divideAndRemainder(P);
                    while (fraction[1].equals(BigInteger.ZERO)) {
                        divisors.add(P);
                        value = fraction[0];
                        fraction = value.divideAndRemainder(P);
                    }
                    if (BigInteger.ONE.equals(value)) break;
                }
                if (!value.equals(BigInteger.ONE)) {
                    divisors.add(value);
                }
            }
            System.out.println(divisors.size());
            for (int i=0; i<divisors.size(); i++) {
                System.out.println(divisors.get(i));
            }
        }
    }
    
}
