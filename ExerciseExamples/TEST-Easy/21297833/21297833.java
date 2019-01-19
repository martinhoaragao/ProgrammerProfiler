import java.util.*;
class LUE
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
boolean t=true;
while(t)
{
int n=scan.nextInt();
if(n==42)
{
t=false;
break;
}
System.out.println(n);
}
}
}