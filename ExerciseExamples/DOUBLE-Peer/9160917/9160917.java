import java.util.Scanner;
class How{
public static void main(String args[])
{
Scanner j = new Scanner(System.in);
int t = j.nextInt();
for(int i=0;i<t;i++)
{
int a = j.nextInt();
if(a%2==0)
{
System.out.println(a);
}
else
{
System.out.println(a-1);
}
}
}
}