import java.util.*;
class a
{
public static void main(String args[])
{
try
{
Scanner ob=new Scanner(System.in);
for(;;)
{
int n=ob.nextInt();
if(n==42)
break;
System.out.println(n);
}
}catch(Exception e){}
}
}