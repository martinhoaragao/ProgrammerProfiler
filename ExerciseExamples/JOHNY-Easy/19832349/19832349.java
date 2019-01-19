import java.util.Scanner;
class Johny
{
public static void sort(int N,long a[])
{
int i,j;
long temp;
for(i=0;i<N;i++)
{
for(j=0;j<N-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int T,i;
T=sc.nextInt();
while(T-->=1)
{
int N=sc.nextInt();
long a[]=new long[(int)N];
for(i=0;i<N;i++)
a[i]=sc.nextLong();
int K=sc.nextInt();
long num=a[K-1];
sort(N,a);
for(i=0;i<N;i++)
{
if(a[i]==num)
{
System.out.println(i+1);
break;
}
}
}
}
}

