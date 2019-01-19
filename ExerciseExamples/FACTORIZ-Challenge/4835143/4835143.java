import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	private static final int TOTAL_PRIMES = 200000;
	private static boolean used[] = new boolean[3000000];
	

	private static int[] primes;
	private static BigInteger[] primesBig;
	
	public static void main(String[] args) {
		long ss = System.currentTimeMillis();
		for(int i=0;i<used.length;i++) used[i] = false;
		primes = new int[TOTAL_PRIMES];
		int tt = 0;
		for(int i=2;i<used.length;i++) {
			if (!used[i]) {
				if (tt < primes.length) primes[tt++] = i;
				int j = i + i;
				while (j < used.length) { used[j] = true; j += i; }
			}
		}
		used = null;
		
		
		/*ArrayList<Integer> inputPrimes = new ArrayList<Integer>(20000);
		for (int i : getPrimes1()) inputPrimes.add(Integer.valueOf(i));
		for (int i : getPrimes2()) inputPrimes.add(Integer.valueOf(i));
		int startValue = 0;*/
		
		//primes = new long[inputPrimes.size()];
		/*int index = 0;
		for (Integer v : inputPrimes) {
			startValue += v.intValue();
			primes[index++] = startValue;
		}*/
		
		primesBig = new BigInteger[primes.length];
		for (int i=0;i<primes.length;i++) {
			primesBig[i] = BigInteger.valueOf(primes[i]);
		}
		//System.out.println("Total: " + (System.currentTimeMillis() - ss));
		
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long timePerTest = (4500 - (start - ss)) / t;
		for (int i=0;i<t;i++) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			BigInteger ni = sc.nextBigInteger();
			if (ni.compareTo(new BigInteger("1000000000000000000")) > 0) {
				for(int j=0;j<primes.length;j++) {
					while (ni.mod(primesBig[j]).equals(BigInteger.ZERO)) {
						result.add(Integer.valueOf(primes[j]));
						ni = ni.divide(primesBig[j]);
					}
					if ((j & 7) == 7 && (System.currentTimeMillis() - start) >= timePerTest * (i + 1)) break;
				}
				System.out.println("" + (ni.equals(BigInteger.ONE) ? result.size() : result.size() + 1));
				for(Integer item : result) System.out.println(item);
				if (!ni.equals(BigInteger.ONE)) System.out.println(ni);
			} else {
				// for long values
				long n = ni.longValue();
				for(int j=0;j<primes.length;j++) {
					while (n % primes[j] == 0) {
						result.add(Integer.valueOf(primes[j]));
						n = n / primes[j];
					}
					if (n < ((long)primes[j]) * primes[j]) break;
					if ((j & 1023) == 1023 && (System.currentTimeMillis() - start) >= timePerTest * (i + 1)) break;
				}
				System.out.println("" + (n == 1 ? result.size() : result.size() + 1));
				for(Integer item : result) System.out.println(item);
				if (n > 1) System.out.println("" + n);
			}
		}
	}
}
