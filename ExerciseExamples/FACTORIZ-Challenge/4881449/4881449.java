
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int t, primes[], arr[], ind = 0;
		BigInteger ans[] = new BigInteger[10000];
		primes= new int[10000];
		arr = new int[10000];
		
		for (int i = 1; i < 10000; ++i) {
			if (arr[i] == 0) {
				primes[ind++] = i+1;
				markMultiples (arr, i+1, 10000);
			}
		}
//		for (int i = 0; i < ind; ++i)
//			System.out.println(primes[i]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		while (t > 0) {
			--t;
			int i = 0, indr = 0;
			BigInteger n = new BigInteger(br.readLine());
			BigInteger[] rd = new BigInteger[2];
			
			while (i < ind && n.compareTo(BigInteger.ONE) > 0) {
				BigInteger p = new BigInteger(primes[i] + "");
				rd = n.divideAndRemainder(p);
				
				if (rd[1].compareTo(BigInteger.ZERO) == 0) {
					n = rd[0];
					ans[indr] = p;
					indr++;
				}
				else {
					i++;
				}
					
			}
			if (n.compareTo(BigInteger.ONE) > 0) {
				ans[indr] = n;
				indr++;
			}
			System.out.println(indr);
			
			for (int j = 0; j < indr; ++j)
				System.out.println(ans[j]);

		}


	}
	public static void markMultiples(int[] arr, int a, int n) {
		int i = 2, num;
		while ((num = i * a) <= n) {
			arr[num - 1] = 1;
			++i;
		}
	}
}