
import java.io.*;
import java.util.*;
 class ATM
{
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in);
   int amount=s.nextInt();
   double init=s.nextDouble();
   if(amount<=(init-0.5))
   {
    if(amount%5==0)
    {
     System.out.printf("%.2f",init-amount-0.5);
    }
    else
    {
     System.out.printf("%.2f",init);
    }
   }
   else
   {
    System.out.printf("%.2f",init);
   }
  }
 }