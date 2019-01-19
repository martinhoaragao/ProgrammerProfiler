import java.util.*;
import java.text.DecimalFormat;
class Program
{   public static void main(String[] args) 
{
    Scanner s = new Scanner(System.in) ;
       int a=s.nextInt();
       double b=s.nextDouble();
       double c;
      DecimalFormat dec = new DecimalFormat("#0.00");
       if (a%5==0)
       {
       c=b-a-0.5;
       if (c<0)
     System.out.println(dec.format(b));
       else 
     System.out.println(dec.format(c)); 
       }
       else 
     System.out.println(dec.format(b)); 
    
}
}