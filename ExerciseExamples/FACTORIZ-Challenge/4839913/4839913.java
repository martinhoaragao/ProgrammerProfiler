     /* package whatever; // don't place package name! */
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.math.*;
    //import java.util.ArrayList;
    //import java.util.List;
    /* Name of the class has to be "Main" only if the class is public. */
    class factorization2
    {
    public static void main (String[] args) throws IOException
    {
    // your code goes here
    int len,t,m=0;
    String s,s1;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    //BigInteger ob1;
    //BigInteger ob2;
    // System.out.println(s);
    while((t--)>0)
    {
    s=sc.next();
    BigInteger ob=new BigInteger(s);
    len=s.length();
    //System.out.println(len);
    if(len>16)
    {
    System.out.println(1);
    System.out.println(s);
    }
    else
    {
    long num;
    num=Long.parseLong(s);
    for(Long fac: primefactors(num))
    System.out.println(fac);
    }
    }
    }//end of main
    static List<Long> primefactors(long n)
    {
    int count=0;
    List<Long> factors = new ArrayList<Long>();
    // Print the number of 2s that divide n
    while (n%2 == 0)
    {
    //printf("%lld ", 2);
    count+=1;
    factors.add(2l);
    n = n/2;
    }
    // n must be odd at this point. So we can skip one element (Note i = i +2)
    for (long i = 3; i <= Math.sqrt(n); i = i+2)
    {
    // While i divides n, print i and divide n
    while (n%i == 0)
    {
    //printf("%lld ", i);
    count+=1;
    factors.add(i);
    n = n/i;
    }
    }
    // This condition is to handle the case whien n is a prime number
    // greater than 2
    if (n > 2)
    {
    //printf ("%d ", n);
    count+=1;
    factors.add(n);
    }
    System.out.println(count);
    return factors;
    }//end of function
    }//end of class
