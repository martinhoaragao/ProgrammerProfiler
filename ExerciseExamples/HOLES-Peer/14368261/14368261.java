import java.util.*;
class holes
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=1;i<=t;i++)
{
String s=sc.next();
int l=s.length();
int count=0;
for(int j=0;j<l;j++)
{
char c=s.charAt(j);
if(c=='B')
count=count+2;
else if(c=='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
count++;
}
System.out.println(count);
}
}
}