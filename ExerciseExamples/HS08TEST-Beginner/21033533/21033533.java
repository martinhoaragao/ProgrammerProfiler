
import java.util.Scanner;
class Atm{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int  with=sc.nextInt();
double acc=sc.nextDouble();
double result=acc;
if(with%5==0&&(with+0.50)<=acc)
{
 result=acc-with-0.50;
}
System.out.println(result);
}
}