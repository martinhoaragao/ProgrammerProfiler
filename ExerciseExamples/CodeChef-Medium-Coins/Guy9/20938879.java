import java.io.*;
import java.util.*;
class coins
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        //int n= Integer.parseInt(br.readLine());
        coins o= new coins();
        while(sc.hasNext())
        {
            long x=sc.nextLong();
            
            System.out.println(o.fun(x));
        }
    }
    long  fun(long n)
    {
        if(n/2+ n/3+ n/4 >n)
        return fun(n/2) + fun(n/3) + fun(n/4);
        else
        return n;
    }
}

        