import java. util.*;

class Sort
{
	public void Insertion(int arr[],int n)
	{
		int i,j,key;
		for(i=0;i<n;i++)
		{
			j=i-1;
			key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
public class Main
{
	public static void main(String[]args)
	{
		int t,n,i,k,key;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0)
		{
			n=sc.nextInt();
			int arr[]=new int[n];
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			k=sc.nextInt();
			key=arr[k-1];
			Sort obj=new Sort();
			obj.Insertion(arr,n);
			for(i=0;i<n;i++)
			{
				if(arr[i]==key)
				{
					System.out.println(i+1);
					break;
				}
			}
			t--;
		}
	}
}