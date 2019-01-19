//srj

import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        
        int i=sc.nextInt();
       
              
        for(int k=0;k<i;k++)
        {
            long n=sc.nextInt();
            
            if(n%2==1)
            n--;
            
            System.out.println(n);
        }
    }
}
