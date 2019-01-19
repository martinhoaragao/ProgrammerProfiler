import java.util.*;
class Test
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
double x=sc.nextFloat();
double y=sc.nextFloat();
if(x%5==0&&y>=x+0.5)
{
y=(y-x)-0.5;
System.out.println(String.format("%.2f",y));
}
else
{
System.out.println(String.format("%.2f",y));
}}}