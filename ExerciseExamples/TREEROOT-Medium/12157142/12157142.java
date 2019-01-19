import java.util.Scanner;
class Solution
{
public static void main(String args[])
{
int t,n;
Scanner s=new Scanner(System.in);
t=s.nextInt();
while(t!=0)
{
int i,sum1=0,sum2=0;
t--;
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
sum1=sum1+a[i];
b[i]=s.nextInt();
sum2=sum2+b[i];
}
for(i=0;i<n;i++)
{
if(a[i]+sum2==sum1)
System.out.print(a[i]+" ");
}
}
}
}