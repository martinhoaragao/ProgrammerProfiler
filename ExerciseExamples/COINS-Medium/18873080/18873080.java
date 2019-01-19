import java.util.*;
class asdf
{
public static long m1(long num)
{
long finalnum;
finalnum=num/2+num/3+num/4;
if (num>=finalnum)
return num;
else
return m1(num/2)+m1(num/3)+m1(num/4);
}
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
for (int i=0;i<10;i++)
{
long s=sc.nextLong();
long sk=m1(s);
System.out.println(sk);
}
}
}