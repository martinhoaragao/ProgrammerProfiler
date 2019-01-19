import java.util.*;
class Atm
{
public static void main(String args[])
{
Scanner scan = new Scanner (System.in);
int a = scan.nextInt();
double b = scan.nextDouble();
if(a%5==0 & a<(b-0.50))
b=b-a-0.50;
System.out.printf("%.2f",b);
}
}