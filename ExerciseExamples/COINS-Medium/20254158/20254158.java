import java.util.*;
class solution
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=10;
        while(T-->0)
        {
            long n = sc.nextInt();
            
            System.out.println(coin(n));
        }
    }
     static long coin(long a)
    {
        if(a<12)
        {
            return a;
        }
        
        return coin(a/2)+coin(a/3)+coin(a/4);
    }
}