import java.util.Scanner;
class JOHNY
{
	public static void main(String[] b)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int N=sc.nextInt();
			int[] length=new int[N];
			for(int i=0;i<N;i++)
				length[i]=sc.nextInt();
			int P=sc.nextInt();
			int key=length[P-1];
			int temp;
			for(int i=0;i<N-1;i++)
			{
				int min=length[i];
				for(int j=i+1;j<N;j++)
				{
					if(min>length[j])
					{
						min=length[j];
						temp=length[i];
						length[i]=min;
						length[j]=temp;
					}
				}
			}
			for(int i=0;i<N;i++)
			{
				if(length[i]==key)
				{
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}