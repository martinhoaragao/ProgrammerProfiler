import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
for(int i=0;i<t;i++)
{
int ss=s.nextInt();
if(ss%2==0)
System.out.println(ss);
else
System.out.println(ss-1);
}
}
} 