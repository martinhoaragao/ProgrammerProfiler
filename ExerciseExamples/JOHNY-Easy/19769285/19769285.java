import java.io.*;
public class Main
{
public static void main(String args[])throws IOException
{
InputStreamReader br = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(br);
int t,n,i,k,u,temp,j,T,c=0;
t=Integer.parseInt(in.readLine());
int b[]= new int[t];
T=t;
while(t>0)
{
n=Integer.parseInt(in.readLine());
int a[]= new int[n];
String str[]=in.readLine().split(" ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(str[i]);
}
k=Integer.parseInt(in.readLine());
u=a[k-1];
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[j]<a[i])
{temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}
for(i=0;i<n;i++)
{
if(a[i]==u)
{
    b[c]=i+1;c++;
}
}
t--;
}
for(i=0;i<T;i++)
{
System.out.println(b[i]);
}
}
}
