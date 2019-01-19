import java.util.*;
class Byte
{
public static void main (String ar[])
{
Scanner sc = new Scanner(System.in);
for(int i=0;i<10;i++)
{
long x=sc.nextLong();
long d=dollar(x);
System.out.println(d);
}
}
public static long dollar(long a)
{
long s=a/2+a/3+a/4;
if (s<=a)
return a;
else
return dollar(a/2)+dollar(a/3)+dollar(a/4);
}
}
