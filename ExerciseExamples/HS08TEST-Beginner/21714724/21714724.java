import java.text.DecimalFormat;
import java.util.*;
 class HelloWorld
{

     public static void main(String []args)
     {
         Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         float f=in.nextFloat();
         if((a+0.5)>f||(a%5!=0))
         System.out.printf("%.2f",f);
         else
         {
             float d=(float)(f-a-0.50);
             System.out.printf("%.2f",d);
         }
         
         
     }
}