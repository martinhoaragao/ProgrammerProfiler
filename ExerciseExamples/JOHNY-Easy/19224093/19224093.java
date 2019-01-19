import java.util.*;
class JOHNY
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=1;i<=t;i++)
{
int n=sc.nextInt();int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
int m=sc.nextInt();
int q=a[m-1];
Arrays.sort(a);
int lp=0,up=n-1;
while(lp<=up)
{
int mid=(lp+up)/2;
if(a[mid]<q)
 lp=mid+1;
else if(a[mid]>q)
 up=mid-1;
else
 {
  System.out.println(mid+1);
  break;
 }
}
}
}
}