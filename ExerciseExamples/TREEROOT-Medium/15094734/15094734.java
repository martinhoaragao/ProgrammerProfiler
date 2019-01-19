import java.util.*;
class Bt
{
 public static void main(String args[])
   {
  
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0)
      {
           int sum=0;
           int n=sc.nextInt();
           //int sumid=sc.nextInt();
           int[] info = new int[2*n];
           
           
           for(int i=0;i<2*n ;i=i+2)
              {
                info[i]=sc.nextInt();
                info[i+1]=sc.nextInt();
              
              }
              
             int max=0,maxid=0;
             for(int i=0;i<2*n;i=i+2)
             {
                
                   sum = sum + (info[i]-info[i+1]);
              
             
             } 
           
           System.out.println(sum);
       }    
 
 } 
}