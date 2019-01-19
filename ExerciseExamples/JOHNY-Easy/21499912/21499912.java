import java.util.Scanner;
import java.util.Arrays; 
class main
{
public static void main(String []args)
{
Scanner r=new Scanner(System.in);
int t,i,n,k,g;
t=r.nextInt();
while(t>0)
{

n=r.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
g=r.nextInt();
arr[i]=g;
}
k=r.nextInt();
int y=arr[k-1];
Arrays.sort(arr);
	for(i=0;i<n;i++)
	{
		if(arr[i]==y)
		{
		System.out.println(i+1);
		break;
		}
	}
t=t-1;
}
}
}