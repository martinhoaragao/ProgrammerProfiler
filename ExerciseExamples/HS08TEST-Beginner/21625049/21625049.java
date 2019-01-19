import java.util.*;
class hs08test
{
public static void main(String args[])
{
Scanner br=new Scanner(System.in);
//System.out.println("Enter");
int a=br.nextInt();
double b=br.nextDouble();
if(a%5!=0 || b<=(a+0.5))
System.out.println(String.format("%.2f",b));
else
System.out.println(String.format("%.2f",b-(a+0.5)));
}
}