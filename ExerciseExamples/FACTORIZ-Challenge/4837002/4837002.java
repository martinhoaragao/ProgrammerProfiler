/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String[] args) {
			
		int N =1000000;
		// initially assume all integers are prime
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= N; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // count primes
        BigInteger[] primes= new BigInteger[N];
        int l=0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes[l++]=new BigInteger(""+i);
        }
        Scanner scan = new Scanner(System.in);
		String s = scan.next();
        int t =Integer.parseInt(s);
      //  System.out.println(t);
		
		while(t>0)
		{
			List<BigInteger> outp=new ArrayList<BigInteger>();
			s =scan.next();
			System.out.println(1);
			System.out.println(s);
			/*int count=0;
			BigInteger r=new BigInteger(s);
			BigInteger onne=new BigInteger("1");
	//		System.out.println(r);
			BigInteger zerro=new BigInteger("0");
			for(int i=0;i<l;i++)
				{
					if(r.compareTo(onne)==0)
						break;
					
					if((r.mod(primes[i])).compareTo(zerro)==0 && r.compareTo(onne)==1)
					{
						while((r.mod(primes[i])).compareTo(zerro)==0 && r.compareTo(onne)==1)
						{
							r=r.divide(primes[i]);
							outp.add(primes[i]);
							count++;
						}
					}
					
				}
			
			if(r.compareTo(onne)==1)
				{outp.add(r);
							count++;}
				
		
		System.out.println(count);
		for(int m=0;m<outp.size();m++)
		System.out.println(outp.get(m));
		*/
		t--;
		}
	}
		
}