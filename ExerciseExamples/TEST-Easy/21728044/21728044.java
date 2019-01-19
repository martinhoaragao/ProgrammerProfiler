import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);

while (true)
{
n=s.nextInt();
if(n!=42)
System.out.println(n);
else
System.exit(0);
}
}
}