import java.util.*;
class doublestr
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=1;i<=t;i++)
{
long n=sc.nextLong();
if(n%2==0)
System.out.println(n);
else
System.out.println(n-1);
}
}
}