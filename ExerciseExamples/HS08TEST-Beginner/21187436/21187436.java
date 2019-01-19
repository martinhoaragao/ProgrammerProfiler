import java.util.Scanner;
class Atm
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Double x=sc.nextDouble();
Double y=sc.nextDouble();
if(y>(x+0.50)&& (x%5==0))
y-=(x+0.50);
System.out.println(y);
}
}
