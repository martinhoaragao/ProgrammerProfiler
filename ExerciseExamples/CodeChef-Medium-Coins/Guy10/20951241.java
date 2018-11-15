import  java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.math.*;
import java.io.*;

class hacker
{  

    /*Fatt Gyi Bhai*/
    //Dekh le mera code
    public static boolean[] sieve(long n)
    {
        boolean[] prime = new boolean[(int)n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        long m = (long)Math.sqrt(n);
        for(int i=2;i<=m;i++)
        {
            if(prime[i])
            {
                for(int k=i*i;k<=n;k+=i)
                {
                    prime[k] = false;
                }
            }
        }
        return prime;
    } 

    
    static long GCD(long a,long b)
    {
        if(a==0 || b==0)
        {
            return 0;
        }
        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            return GCD(a-b,b);
        }
        return GCD(a,b-a);
    }

    static long CountCoPrimes(long n)
    {
        long res = n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                res-=res/i;
            }
        }
        if(n>1)
        {
            res-=res/n;
        }
        return res;
    }

    static long modularExponentiation(long x,long n,long m)
    {
        long res = 1;
        while(n>0)
        {
            if(n%2==1)
            {
                res = (res*x)%m;
            }
            x =(x*x)%m;
            n/=2;
        }
        return res;
    }

    static long lcm(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }

   
    static long pow(long a,long b)
    {
        long res = 1;
        while(b>0)
        {
            if((b&1)==1)
            {
                res *= a;
            }

            b >>= 1;
            a *=a;
        }
        return res;
    }

   static long modInverse(long A,long M)
   {
    return modularExponentiation(A,M-2,M);
   }
    static long fact(long n)
    {
        long res = 1;
        for(int i=1;i<=n;i++)
        {
            res = (res*i)%1000000007;
        }
        return res%1000000007;
    }

  
    public static void main(String[] args) throws IOException
    {
       // in = new Scanner(new File("explicit.in"));
        //out = new PrintWriter("explicit.out");
        new hacker().run();
       
    }

   
    static long digits(long n)
    {
        long res =0;
        while(n>0)
        {
            res+=n%10;
            n/=10;
        }
        return res;
    }

   
    
   
   
    static void run() throws IOException
    {

            //Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            while((str=br.readLine())!=null)
            {
                try
                {
                    long p = Long.parseLong(str);
                    System.out.println(getC(p));
                }
                catch(Exception e)
                {
                    break;
                }
            }
    }

    static long getC(long n)
    {
        if(n<12) return n;
        else return getC(n/2)+getC(n/3)+getC(n/4);

    }
    static long abs(long n)
    {
        return Math.abs(n);
    }
   
    
    
    static class Scanner 
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException 
        {
            while (st == null || !st.hasMoreTokens()) 
            {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}
        
        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public boolean ready() throws IOException {return br.ready();}


    }

   


    
}

   
