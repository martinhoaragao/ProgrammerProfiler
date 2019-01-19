import java.util.*;
import java.io.*;
import java.math.*;
import java.security.SecureRandom;

public class Main {
  
  private static final BigInteger ZERO = BigInteger.ZERO;
  private static final BigInteger ONE = BigInteger.ONE;
  private static final BigInteger TWO = new BigInteger(String.valueOf(2));
  private static final BigInteger LIMIT = BigInteger.TEN.pow(100);
  private static final int N_REPEAT = 100;
  private static final SecureRandom random = new SecureRandom();
  private static final String NL = System.getProperty("line.separator");
  public static void main(String[] args) throws IOException {
    long s = System.nanoTime();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      BigInteger N = new BigInteger(br.readLine());
      List<BigInteger> list = factor(N);
      int M = list.size();
      sb.append(M);
      sb.append(NL);
      for (BigInteger f : list) {
        sb.append(f);
        sb.append(NL);
      }
    }
    long e = System.nanoTime();
    System.out.println(sb.toString());
    // System.out.println((e - s)/(1000 * 1000));
  }
  
  private static List<BigInteger> factor(BigInteger N) {
    List<BigInteger> list = new ArrayList<BigInteger>();
    getFactors(N, list);
    return list;
  }
  public static BigInteger getFactor(BigInteger N) {
    
    BigInteger divisor;
    BigInteger c  = new BigInteger(N.bitLength(), random);
    BigInteger x  = new BigInteger(N.bitLength(), random);
    BigInteger xx = x;
    
    // check divisibility by 2
    if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;
    int i = 0;
    do {
      i++;
      if (i > N_REPEAT) return N;
      x  =  x.multiply(x).mod(N).add(c).mod(N);
      xx = xx.multiply(xx).mod(N).add(c).mod(N);
      xx = xx.multiply(xx).mod(N).add(c).mod(N);
      divisor = x.subtract(xx).gcd(N);
    } while((divisor.compareTo(ONE)) == 0);
    
    return divisor;
  }
  
  public static void getFactors(BigInteger N, List<BigInteger> facs) {
    if (N.compareTo(ONE) == 0) {
      return;
    }
    if (N.compareTo(LIMIT) > 0) {
      facs.add(N);
        return; 
    }
    if (N.isProbablePrime(20)) { 
      facs.add(N);
        return; 
    }
    BigInteger divisor = getFactor(N);
    if (divisor.equals(N)) {
      facs.add(N);
        return;
    }
    getFactors(divisor, facs);
    getFactors(N.divide(divisor), facs);
  }
}
