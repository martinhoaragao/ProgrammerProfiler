/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
import java.math.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
		//System.out.println(t);
		int m,j;
		BigInteger nsqrt,min;
		ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
		for(j=0;j<t;j++)
		{
			//System.out.println("j="+j);
			line = br.readLine();
			BigInteger n= new BigInteger(line);
			m=1;
			//int[] pf=new int[1000];
			//System.out.println(n.toString());	
			BigInteger one=new BigInteger("1");
			/*BigInteger two=new BigInteger("2");
		    if(n.mod(two).compareTo(BigInteger.ZERO)==0)
			{
				primes.add(two);
				m++;     
				n=n.divide(two);
			}*/
			//nsqrt=n.pow(0.5);

			min=n.min(new BigInteger("3500"));
			for( BigInteger i = new BigInteger("2"); i.compareTo(min) <= 0 ; i = i.add(one) )
			{
				while( n.mod(i).compareTo(BigInteger.ZERO)==0)
				{
					primes.add(i);
					m++;
					n=n.divide(i);
				}

			}
			if(n.compareTo(one)==0)
				m--;
			else
				primes.add(n);
			System.out.println(m);
			for(int i = 0; i < primes.size(); i++)
				    System.out.println(primes.get(i).toString());

			primes.clear();

		}
	}
}
        

       


