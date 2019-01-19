import java.util.Scanner;
class A
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
while(true)
{
 int n=sc.nextInt();
  if(n==42)
   {
      break;
   }
   else
   {
   System.out.println(n);
   }
}
}
}