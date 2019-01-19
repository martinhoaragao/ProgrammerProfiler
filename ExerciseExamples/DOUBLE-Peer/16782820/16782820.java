import java.util.*;
class Nine
{
    public static void main (String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=ob.nextInt();
            if(n%2==0)
                System.out.println(n);
            else
                System.out.println(n-1);
        }
    }
}