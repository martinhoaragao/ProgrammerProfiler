import java.util.*;
class Demo
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s;
        for(int i=0;i<t;i++)
        {
             s=sc.nextInt();
             int[] a=new int[s];
             for(int j=0;j<s;j++)
             {
                   a[j]=sc.nextInt();
              }
              int p=sc.nextInt();
              int q=a[p-1];
              Arrays.sort(a);
              for(int k=0;k<s;k++)
              {
                 if(a[k]==q)
                 {
                     System.out.println(k+1);
                  }
              }
           }
       }
   }                  
                 
                 
                   