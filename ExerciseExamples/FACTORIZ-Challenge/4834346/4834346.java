import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Factorization
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int flag=0;
    	int t,tmp,i,j,size; //to Long
   		List<Integer> primes = new ArrayList<Integer>(100000);
   		List<Integer> factors = new ArrayList<Integer>(100000);//Could change this capacity
   		size=0; // Could change initial value
   		
   		//SIEVE OF ERATOSTHENES
   		boolean[] isPrime = new boolean[100000];
        for (i = 2; i < 20000; i++) {
            isPrime[i] = true;
        }
        
        for (i = 2; i*i < 20000; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (j = i; i*j < 20000; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        
        for (i = 2; i < 20000; i++) {
            if (isPrime[i]) primes.add(i);
        }
   		
   		/*for(i=2;i<100000;i++) //Could change this limit
   		{
   			for(j=0;j<size && flag==0;j++)
   			{
   				if(i%(primes.get(j))==0)
   				{
   					flag=1;
   				}
   			}
   			if(flag==0)
   			{
   				primes.add(i);
   				size++;
   			}
   			else
   			{
   				flag=0;
   			}
   		}*/
   		
		t=in.nextInt();
		while((t--)>0)
        {
        	String a=in.next();
        	BigInteger n=new BigInteger(a);
        	
        	BigInteger one=new BigInteger("1");
        	
        	size=primes.size();
        	
        	flag=0;
        	if(n.compareTo(one)==0)
        	{
        		flag=1;
        	}
        	for(i=0;i<size && n.compareTo(one)!=0;i++)
        	{
        		tmp=primes.get(i);
        		BigInteger k=new BigInteger(Integer.toString(tmp));
        		BigInteger zero=new BigInteger("0");
        		while(n.remainder(k).compareTo(zero)==0)
        		{
        			factors.add(tmp);
        			n=n.divide(k);
        		}
        	}
        	
        	size=factors.size();
        	if(flag==1 || n.compareTo(one)!=0)
        	{
	        	System.out.println(size+1);
        	}
        	else
        	{
        		System.out.println(size);
        	}
        	
        	for(i=0;i<size;i++)
        	{
        		System.out.println(factors.get(i));
        	}
        	if(flag==1 || n.compareTo(one)!=0)
        	{
	        	System.out.println(n);
        	}
        	factors.clear();
        }
	}
}