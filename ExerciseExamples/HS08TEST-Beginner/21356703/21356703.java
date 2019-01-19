import java.util.Scanner;
class Atm
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
	int x; 
double y,ans;
x=input.nextInt();
y=input.nextDouble();
if((x%5)==0 && (x +0.5<= y))
{
ans=(y-x-0.5);
}
else
{
ans=y;
}
System.out.println(ans);
}
}