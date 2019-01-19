import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
            throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
        long val=sc.nextLong();
      
        System.out.println(maxval(val));
        }
 
    }
    static long maxval(long n)
    {
        long sum=(n/2)+(n/3)+(n/4);
        if(sum>n)
        {
            return maxval(n/2)+maxval(n/3)+maxval(n/4);
        }
        else
        {
            return n;
        }
        
    }
}