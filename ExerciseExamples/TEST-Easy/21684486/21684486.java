import java.util.Scanner;
class A
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
for(;;)
{
 int n=sc.nextInt();
  if(n!=42)
   {
      System.out.println(n);
   }
   else
   {
   break;
   }
}
}
}