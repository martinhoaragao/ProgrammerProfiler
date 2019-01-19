import java.util.Scanner;

class BytelandianGoldCoins 
{
    public static long coin(long p)
    {
        if(p<12)
        {
            return p;
        }
    
        return coin(p/2)+coin(p/3)+coin(p/4);
                              
    }
    public static void main(String[] args) 
    {
        long sum2=0;
        Scanner sc=new Scanner(System.in);
        int t =10;
        while(t>0)
        {
            long n=sc.nextLong();
            sum2=coin(n);
            System.out.println(sum2);
            t--;
        }
        
    }
}
