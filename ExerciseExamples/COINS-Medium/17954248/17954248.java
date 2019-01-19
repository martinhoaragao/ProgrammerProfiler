import java.util.*;
class coins
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);
for(int i=0;i<10;i++)
{
long t=sc.nextLong();
long c=find(t);
System.out.println(c);
}
}

static long find(long a)
{
if((a/2+a/3+a/4)>a)
return(find(a/2)+find(a/3)+find(a/4));
else 
return a;
}
}