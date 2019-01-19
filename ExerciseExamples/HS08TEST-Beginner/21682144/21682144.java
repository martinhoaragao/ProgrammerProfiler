import java.util.*;
class atm
{
   public static void main(String args[])
    {
      int a;
      float b;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();                                        
      b=sc.nextFloat();                                  
      if(((a+0.50)<b) && a%5==0)
           System.out.println(b-(a+0.50));
      else
           System.out.println(b);
      }
}