import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();



while(t-->0)
{

int n=sc.nextInt();
int a[]=new int[n];


for(int k=0;k<n;k++)
{
a[k]=sc.nextInt();
}
int m=sc.nextInt();
int c=0;
for(int k=0;k<n;k++)
{
if(a[k]<a[m-1])
c++;
}
System.out.println(c+1);
}
}
}
