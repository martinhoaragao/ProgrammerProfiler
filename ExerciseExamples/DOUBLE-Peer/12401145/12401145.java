import java.util.*;
class DOUBLE
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int i,a,l;
a=s.nextInt();
for(i=1;i<=a;i++)
{
l=s.nextInt();
if(l%2==0)
System.out.println(l);
else
System.out.println(l-1);
}
}
}