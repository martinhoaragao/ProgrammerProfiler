import java.util.*;
class playlist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j,temp;
temp=0;
n=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
k=sc.nextInt();
temp=a[k-1];
Arrays.sort(a);
for(j=0;j<n;j++)
{
if(a[j]==temp)
{
System.out.println(j+1);
}
}
}
}
}