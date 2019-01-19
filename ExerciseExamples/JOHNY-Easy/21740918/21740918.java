//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
      int t;
        
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int temp=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            
            int position=sc.nextInt();
           
                temp=a[position-1];
            Arrays.sort(a);
        
            for(int k=0;k<n;k++)
            {
                if(temp==a[k])
                {
                    System.out.println(k+1);
                }
            }
        }
    }
}
            
    