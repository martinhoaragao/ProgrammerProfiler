import java.util.*;
class Test
{
  public static void main(String args[])
  {
     int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     if(n<0 || n>Math.pow(10, 5))
     {
        System.exit(0);
     }
     else{
           System.out.print(n);
         }
   }
 }
     
