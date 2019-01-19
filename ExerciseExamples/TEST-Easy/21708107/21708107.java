import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
       int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=42)
        {
            System.out.println(n);
            n=sc.nextInt();
        }
        
    }
}