import java.util.*;

class COINS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            long N=s.nextLong();
            System.out.println(find(N));
        }
    }
    public static long find(long N)
    {
        long s=N/2+N/3+N/4;
        if(s>N)
        {
            return(find(N/2)+find(N/3)+find(N/4));
        }
        else
        {
            return(N);
        }
    }
} 