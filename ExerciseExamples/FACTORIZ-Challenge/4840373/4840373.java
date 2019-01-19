import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] s) {
		try {
			InputStream inputStream = System.in;
			InputReader in = new InputReader(inputStream);
			PrintWriter writer = new PrintWriter(System.out);

			TaskA solution = new TaskA();
			solution.solve(in,writer);

			writer.close();
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class TaskA {
	private List<Integer> intPrimes;
	private List<BigInteger> bigIntPrimes;
	private int primelimit = 1000000;

	public void solve(InputReader in, PrintWriter out) throws IOException {
		initPrimes();
		initBigIntPrimes();

		int tests = in.nextInt();

		for (int i=0;i<tests;i++) {
			String number = in.next();

			List<String> factors = getFactors(number);
			out.println(factors.size());

			for (String factor : factors) {
				if (factor.equals("1"))
					throw new RuntimeException("incorrect factor");
				out.println(factor);
			}
		}

	}

	private void initBigIntPrimes() {
		bigIntPrimes = new ArrayList<BigInteger>();
		for (int i = 0; i < intPrimes.size(); i++) {
			bigIntPrimes.add(new BigInteger(String.valueOf(intPrimes.get(i))));
		}
	}

	private List<String> getFactors(String number) {
		if (number.length() < 18) {
			long num = Long.parseLong(number);
			return getFactorsForLongNos(num);
		}

		if (number.length() < 3000) {
			return getFactorsForBigIntegers(number);
		}

		return Arrays.asList(new String[] {number});
	}

	private List<String> getFactorsForBigIntegers(String num) {
		// check if probably prime.
		if (isProbablePrime(num)) {
			return Arrays.asList(new String[]{num + ""});
		}

		BigInteger number = new BigInteger(num);

		// test with the usual small factors
		int totalfactorsTested = 2000;
		Map<String, Integer> factorsCount = new HashMap<String, Integer>();

		for (int i = 0; i < totalfactorsTested; i++) {
			BigInteger prime = bigIntPrimes.get(i);
			int k = 0;
			while (number.mod(prime).compareTo(BigInteger.ZERO) == 0) {
				number = number.divide(prime);
				k++;
			}

			if (k > 0) {
				factorsCount.put(prime.toString(), k);
			}
		}

		if (number.compareTo(BigInteger.ONE) > 0) {
			factorsCount.put(number.toString(), 1);
		}

		return getFactorsAsString(factorsCount);

	}

	private List<String> getFactorsForLongNos(long num) {
		// check if probably prime.
		if (isProbablePrime(num + "")) {
			return Arrays.asList(new String[]{num + ""});
		}

		int factorsLimit = 3000;
		Map<Long, Integer> factorsCount = new HashMap<Long, Integer>();

		for (int prime : intPrimes) {

			if (prime > num / prime)
				break;

			int k = 0;
			while (num % prime == 0) {
				num /= prime;
				k++;
			}

			if (k > 0) {
				factorsCount.put((long)prime, k);
				// added to run the program in time, else we will run out of it, if we keep finding all the factors.
				factorsLimit--;
				if (factorsLimit == 0)
					break;
			}
		}

		if (num > 1)
			factorsCount.put(num, 1);

		return getFactorsAsString(factorsCount);
	}

	private <K,V extends Integer> List<String> getFactorsAsString(Map<K, V> factorsCount) {
		List<String> factors = new ArrayList<String>();

		for (Map.Entry<K, V> entry : factorsCount.entrySet()) {
			K factor = entry.getKey();
			V count = entry.getValue();

			for (int i = 0; i < count.intValue(); i++) {
				factors.add(factor + "");
			}
		}

		return factors;
	}

	private boolean isProbablePrime(String num) {
		BigInteger bigInteger = new BigInteger(num);
//		return bigInteger.isProbablePrime(10);
		return false;
	}

	private void initPrimes() {
		int root = (int) Math.sqrt(primelimit) + 1;

		boolean[] primes = new boolean[primelimit];
		Arrays.fill(primes, true);

		for (int i = 2; i < root; i++) {
			for (int j = i * i; j < primelimit; j += i) {
				primes[j] = false;
			}
		}

		intPrimes = new ArrayList<Integer>();
		intPrimes.add(2);
		for (int i = 3; i < primes.length; i += 2) {
			if (primes[i])
				intPrimes.add(i);
		}

	}




}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream));
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}