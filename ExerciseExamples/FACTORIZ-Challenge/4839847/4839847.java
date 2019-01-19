import java.math.*;
import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
            int T;
            long count2,count3,count5,count7,i;
            BigInteger N;
            Scanner in=new Scanner(System.in);
            T=in.nextInt();
            while(T>0)
            {
                count2=count3=count5=count7=0;
                N=in.nextBigInteger();
                while(N.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0))
                {
                    N=N.divide(BigInteger.valueOf(2));
                    count2++;
                }
                while(N.mod(BigInteger.valueOf(3))==BigInteger.valueOf(0))
                {
                    N=N.divide(BigInteger.valueOf(3));
                    count3++;
                }
                while(N.mod(BigInteger.valueOf(5))==BigInteger.valueOf(0))
                {
                    N=N.divide(BigInteger.valueOf(5));
                    count5++;
                }
                while(N.mod(BigInteger.valueOf(7))==BigInteger.valueOf(0))
                {
                    N=N.divide(BigInteger.valueOf(7));
                    count7++;
                }
                if(N.compareTo(BigInteger.valueOf(1))!=0)
                {
                    System.out.println(count2+count3+count5+count7+1);
                    for(i=1;i<=count2;i++)
                    System.out.println("2");    
                    for(i=1;i<=count3;i++)
                    System.out.println("3");    
                    for(i=1;i<=count5;i++)
                    System.out.println("5");    
                    for(i=1;i<=count7;i++)
                    System.out.println("7");    
                    System.out.println(N);    
                }
                else
                {
                    System.out.println(count2+count3+count5+count7);
                    for(i=1;i<=count2;i++)
                    System.out.println("2");    
                    for(i=1;i<=count3;i++)
                    System.out.println("3");    
                    for(i=1;i<=count5;i++)
                    System.out.println("5");    
                    for(i=1;i<=count7;i++)
                    System.out.println("7");    
                }
                T--;
            }
        
    }
}  