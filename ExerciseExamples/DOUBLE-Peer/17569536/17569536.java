import java.util.*;
class ITRA01
{
    public static void main(String[] args)
    {
        Scanner ag=new Scanner(System.in);
        int t=ag.nextInt();
        while(t-->0)
        {
            int n=ag.nextInt();
            
            if(n==0)
            System.out.println(0);
            if(n%2==0)
            System.out.println(n);
            else
            System.out.println(n-1);
    }
}
}