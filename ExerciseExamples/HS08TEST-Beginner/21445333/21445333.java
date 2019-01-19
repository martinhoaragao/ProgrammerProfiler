import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         double val=sc.nextDouble();
         if(x%5==0&&x<(int)val)
         {
             double d=(double)x+0.50;
         System.out.printf("%.2f",val-d);
         }
         else
         System.out.printf("%.2f",val); 
         

    }
}