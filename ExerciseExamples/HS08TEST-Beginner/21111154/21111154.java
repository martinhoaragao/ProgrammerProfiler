import java.util.*;
class atm
{
  public static void main(String a[])
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   double d=sc.nextDouble();
   String f=String.format("%.2f",d);
   if(n>=Math.round(d))
	  System.out.println(f);
  
   else if(n%5==0)
   {
	   d=d-n-0.5;
	   String f1=String.format("%.2f",d);
	   System.out.println(f1);
   }
   else 
	   System.out.println(f);
  }
}