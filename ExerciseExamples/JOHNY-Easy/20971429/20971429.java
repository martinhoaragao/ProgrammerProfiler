import java.util.*;
class UncleJohnny {
	public static void main(String args[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int n,k;
			n=sc.nextInt();
			List<Integer> inp=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				int t;
				t=sc.nextInt();
				inp.add(t);
			}
			k=sc.nextInt();
			int uj=inp.get(k-1);
			Collections.sort(inp);
			int ret=inp.indexOf(uj);
			System.out.println(ret+1);
			
		}
	}
}
