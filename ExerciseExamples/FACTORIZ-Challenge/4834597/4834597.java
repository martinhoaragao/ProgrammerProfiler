
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static ArrayList<Long> prime;
	static BigInteger limit = new BigInteger("1000000");
	static BigInteger two=new BigInteger("2");
	static int time_limit=2700;
	static long t1;
	static long t2;

	public static void main(String args[]) throws NumberFormatException,
			IOException {

		Stdin in = new Stdin();
		PrintWriter out = new PrintWriter(System.out);
		int t = in.readInt();
		t1 = System.currentTimeMillis();
		ArrayList<Long> ans0;
		ArrayList<String> ans1;
		prime = prime();
		String str;
		for (int i = 0; i < t; i++) {
			str = in.readNext();
			if (str.length() <= 18) {
				ans0 = solve0(Long.parseLong(str));
				out.println(ans0.size());
				for (long l : ans0)
					out.println(l);
			} else {
				ans1 = solve1(new BigInteger(str));
				out.println(ans1.size());
				for (String l : ans1)
					out.println(l);
			}
		}
		out.flush();
		out.close();

	}

	private static ArrayList<Long> prime() {
		boolean used[] = new boolean[1000000];
		ArrayList<Long> prime = new ArrayList<Long>();
		prime.add((long) 2);
		for (int i = 3; i < used.length; i += 2) {
			if (!used[i]) {
				prime.add((long) i);
				for (int j = 3 * i; j < used.length; j += 2 * i) {
					used[j] = true;
				}
			}
		}
		return prime;
	}

	private static ArrayList<String> solve1(BigInteger n) {
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<BigInteger> prime1 = new ArrayList<BigInteger>();
		BigInteger d = BigInteger.ZERO;
		if (System.currentTimeMillis() - t1 <= time_limit) {
			for (long i : prime)
				prime1.add(new BigInteger(i + ""));
			for (BigInteger i : prime1) {
				if (i.compareTo(n) > 0)
					break;
				while (n.mod(i) == BigInteger.ZERO) {
					ans.add(i.toString());
					n = n.divide(i);
				}
			}
			while (n.compareTo(limit) > 0 && d.compareTo(BigInteger.ONE) != 0
					&& System.currentTimeMillis() - t1 < time_limit) {
				d = p_minus_1_big(n);
				if (d.compareTo(BigInteger.ONE) == 0)
					break;
				else
					ans.add(d.toString());
				n = n.divide(d);
			}
		}else{
			while(n.mod(two).equals(BigInteger.ZERO)){
				ans.add(two.toString());
				n=n.divide(two);
			}
		}
		if (n.compareTo(BigInteger.ONE) > 0)
			ans.add(n.toString());
		return ans;
	}

	private static ArrayList<Long> solve0(long n) {
		ArrayList<Long> ans = new ArrayList<Long>();
		long d = 0;
		if (System.currentTimeMillis() - t1 < time_limit) {
			for (long i : prime) {
				if (i > n)
					break;
				while (n % i == 0) {
					ans.add(i);
					n /= i;
				}

			}
			while (n > 1000000 && d != 1
					&& System.currentTimeMillis() - t1 < time_limit) {
				d = p_minus_1(n);
				if (d == 1)
					break;
				else
					ans.add(d);
				n /= d;
			}
		}else{
			while(n%2==0){
				ans.add(prime.get(0));
				n/=2;
			}
		}
		if (n > 1)
			ans.add(n);
		return ans;
	}

	private static long p_minus_1(long n) {
		long x = 2;
		long y = 2;
		long d = 1;
		int steps = 20000;
		while (d == 1 && steps > 0) {
			x = f(x, n);
			y = f(f(x, n), n);
			if (x <= y)
				d = gcd(y - x, n);
			else
				d = gcd(x - y, n);
			steps--;
		}
		return d;
	}

	private static BigInteger p_minus_1_big(BigInteger n) {
		BigInteger x = new BigInteger(2 + "");
		BigInteger y = new BigInteger(2 + "");
		BigInteger d = BigInteger.ONE;
		int steps = 1000;
		while (d.equals(BigInteger.ONE) && steps > 0) {
			x = f1(x, n);
			y = f1(f1(x, n), n);
			if (x.compareTo(y) <= 0)
				d = gcd1(y.subtract(x), n);
			else
				d = gcd1(x.subtract(y), n);
			steps--;
		}
		return d;
	}

	private static BigInteger f1(BigInteger x, BigInteger n) {
		return x.multiply(x).subtract(BigInteger.ONE)
				.mod(new BigInteger(n + ""));
	}

	private static BigInteger gcd1(BigInteger a, BigInteger b) {
		return a.gcd(b);
	}

	private static long f(long x, long n) {
		long ans = x * x - 1;
		if (ans < 0) {
			BigInteger a1 = new BigInteger(x + "");
			return Long.parseLong((a1.multiply(a1).subtract(BigInteger.ONE)
					.mod(new BigInteger(n + ""))).toString());
		}
		return ans % n;
	}

	private static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	private static class Stdin {
		InputStreamReader read;
		BufferedReader br;

		StringTokenizer st = new StringTokenizer("");

		private Stdin() {
			read = new InputStreamReader(System.in);
			br = new BufferedReader(read);

		}

		private String readNext() throws IOException {

			while (!st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		private int readInt() throws IOException, NumberFormatException {

			return Integer.parseInt(readNext());

		}

		private long readLong() throws IOException, NumberFormatException {

			return Long.parseLong(readNext());

		}
	}
}
