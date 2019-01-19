import java.util.*;
class program
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			ArrayList<Integer>al=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				int q=sc.nextInt();
				al.add(q);
			}
			int k=sc.nextInt();
			int l=al.get(k-1);
			
			Collections.sort(al);
			System.out.println(al.indexOf(l)+1);
		}
	}
}