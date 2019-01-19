import java.math.BigInteger;
import java.io.*;
import java.util.*;
 
public class Main {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int t = in.nextInt();
    
    int[] primes = new int[10];
    int pcnt = 0;
    
    for (int i = 2; pcnt < 10; ++i) {
      Boolean prime = true;
      for (int j = 0; j < pcnt; ++j) {
        if (i % primes[j] == 0) {
          prime = false;
          break;
        }
      }
      if (prime)
        primes[pcnt++] = i;
    }
    
    int[] ans = new int[5000];
    
    for (int tt = 0; tt < t; ++tt) {
      BigInteger n = in.nextBigInteger();
 
      int anssz = 0;
        
      for (int i = 0; i < pcnt && n.compareTo(BigInteger.valueOf(primes[i])) != -1; ++i) {
        while (n.mod(BigInteger.valueOf(primes[i])).equals(BigInteger.ZERO)) {
          ans[anssz++] = primes[i];
          n = n.divide(BigInteger.valueOf(primes[i]));
        }
      }
        
      if (n.equals(BigInteger.ONE))
        out.println(anssz);
      else
        out.println(anssz+1);
        
      for (int i = 0; i < anssz; ++i)
        out.println(ans[i]);
        
      if (!n.equals(BigInteger.ONE))
        out.println(n);
    }
    
    out.close();
  }
}   