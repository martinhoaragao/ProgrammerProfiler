import java.util.*;
class a
{
	public  static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			int[] arr=new int[d];
			for(int j=0;j<d;j++)
				arr[j]=sc.nextInt();
			int pos=sc.nextInt();
			int s=arr[pos-1];
			int x=0;
			Arrays.sort(arr);
			for(int z=0;z<d;z++)
			{
				if(arr[z]==s)
					x=z+1;
			}
			System.out.println(x);
		}
	}
}
					