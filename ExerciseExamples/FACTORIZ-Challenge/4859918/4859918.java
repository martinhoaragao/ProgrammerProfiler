import java.io.*;
import java.math.BigInteger;
 
public class Main {
 
	static BigInteger N;
	static long primes[];
	static int factors[];
	static BigInteger BigPrimes[];
	static OutputStream out;
	
	private static void genPrimes(int limit)
	{
		primes = new long[limit / 8];
		factors = new int[limit / 8];
		int k = 0;
		primes[k++] = 2;
		primes[k++] = 3;
		primes[k++] = 5;
		primes[k++] = 7;
		primes[k++] = 11;
		primes[k++] = 13;
		primes[k++] = 17;
		primes[k++] = 19;
		for(int n = 23; n <= limit; n++)
		{
			boolean flag = true;
			int s = (int) Math.sqrt((double)n);
			for(int i = 0; primes[i] <= s; i++)
				if(n % primes[i] == 0)
				{
					flag = false;
					break;
				}
			if(flag)
			{
				primes[k++] = n;
			}
		}
		BigPrimes = new BigInteger[k];
		for(int i = 0; i < k; i++)
			BigPrimes[i] = BigInteger.valueOf(primes[i]);
	}
	private static void factorize(long N) throws IOException
	{
		long facts = 0;
		long copy = N;
		for(int i = 0; i < primes.length && primes[i] <= copy && primes[i] != 0; i++)
		{
			factors[i] = 0;
			while(N > 0 && N % primes[i] == 0)
			{
				factors[i]++;
				N /= primes[i];
			}
			facts += factors[i];
		}
		if(N > 1)
		{
			out.write(((facts + 1) + "\n").getBytes());
			out.write((N + "\n").getBytes());
		}
		else
			out.write((facts + "\n").getBytes());
		for(int i = 0; i < primes.length && primes[i] <= copy; i++)
			for(int j = 0; j < factors[i]; j++)
				out.write((primes[i] + "\n").getBytes());
	}
	
	private static void factorize(BigInteger N) throws IOException
	{
		long facts = 0;
		BigInteger copy = N;
		for(int i = 0; i < BigPrimes.length && BigPrimes[i].compareTo(copy) <= 0 && primes[i] != 0; i++)
		{
			factors[i] = 0;
			while(N.compareTo(BigInteger.ZERO) > 0)
			{
				BigInteger[] divresult = N.divideAndRemainder(BigPrimes[i]);
				if(divresult[1].compareTo(BigInteger.ZERO) != 0)
					break;
				factors[i]++;
				N = divresult[0];
			}
			facts += factors[i];
		}
		if(N.compareTo(BigInteger.ONE) > 0)
		{
			out.write(((facts + 1) + "\n").getBytes());
			out.write((N.toString() + "\n").getBytes());
		}
		else
			out.write((facts + "\n").getBytes());
		for(int i = 0; i < BigPrimes.length && BigPrimes[i].compareTo(copy) <= 0; i++)
			for(int j = 0; j < factors[i]; j++)
				out.write((primes[i] + "\n").getBytes());
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		genPrimes(30000);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedOutputStream(System.out);
        
		int T = Integer.parseInt(in.readLine());
		while(T-- > 0)
		{
			String line = in.readLine();
			N = new BigInteger(line);
			if(N.compareTo(BigInteger.valueOf(1000000000000000000L)) <= 0)
			{
				factorize(Long.parseLong(line));
			}
			else
			{
				factorize(N);				
			}
			out.flush();
		}
		in.close();
		out.close();
	}
 
} 