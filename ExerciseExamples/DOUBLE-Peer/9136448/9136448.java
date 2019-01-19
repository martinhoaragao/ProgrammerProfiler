import java.util.*;
class tp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int len=sc.nextInt();
if(len%2==0)
{
System.out.println(len);
}
else
{
System.out.println(len-1);
}
t--;
}
}
}