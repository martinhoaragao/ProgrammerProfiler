import java.util.Scanner;
class JU
{
public static void main(String []args)
{

Scanner a=new Scanner(System.in);
int t=a.nextInt();
for(int i=1;i<=t;i++)
{
int count=0;
int n=a.nextInt();
int []A=new int[n];
for(int j=0;j<n;j++)
{
A[j]=a.nextInt();
}
int k=a.nextInt();
for(int j=0;j<n;j++)
{

if(A[j]<=A[k-1])
{
count++;
}
}
System.out.println(count);
}
}
}