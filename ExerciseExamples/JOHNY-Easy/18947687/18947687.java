import java.util.*;
class Main
{
public static void main(String[] ss)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int k=a[sc.nextInt()-1];
Arrays.sort(a);
for(int i=0;i<n;i++)
{
	if(a[i]==k)
	{
		System.out.println(i+1);
		break;
	}
}
}
}
}