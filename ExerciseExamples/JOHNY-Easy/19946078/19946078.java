import java.util.Scanner;
import java.util.*;
class Bc{
public static void main(String args[])
{
int t, i, j;
Scanner in =new Scanner(System.in);
t=in.nextInt();
for(i=1;i<=t;i++)
{
int n;
n=in.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=in.nextInt();
}
int k;
k=in.nextInt();
int m=a[k-1];
Arrays.sort(a);
for(j=0;j<n;j++)
{
if(a[j]==m)
break;
}
System.out.println(j+1);
}
}
}