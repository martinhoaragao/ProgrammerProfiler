import java.io.*;
import java.util.*;
class Test
{
    
    public static void main(String args[])throws IOException
    {
        
        Scanner sc= new Scanner(System.in);
        
        Test obj= new Test();
        while(sc.hasNext())
        {
            long x=sc.nextLong();
            
            System.out.println(obj.calc(x));
        }
    }
    long  calc(long n)
    {
        if(n/2+ n/3+ n/4 >n)
        return calc(n/2) + calc(n/3) + calc(n/4);
        else
        return n;
    }
}

        