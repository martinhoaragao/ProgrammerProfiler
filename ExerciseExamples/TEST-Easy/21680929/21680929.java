import java.util.*;

class Firstprogram
{
     public static void main(String args[])throws Exception
     {
         Scanner sc=new Scanner(System.in);
         int n;   
         do{
         
            n=sc.nextInt();
            if(n!=42)
               System.out.println(n);
           }while(n!=42);
     }
}