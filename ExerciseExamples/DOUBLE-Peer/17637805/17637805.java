import java.util.*;
import java.lang.*;

class choco
{
    public static void main (String[] args)
    {
        int t ;
        Scanner sc=new Scanner(System.in) ;
        t=sc.nextInt();
        for (int z=0;z<t;z++)
        {
            int n;
            n=sc.nextInt();
            if(n%2==0) System.out.println(n);
            else System.out.println(n-1);
        }
    }
}