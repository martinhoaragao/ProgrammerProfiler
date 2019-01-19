import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class bytelandgoldcoin {
	public void run()
		{
			try {
				solve();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private void solve()
		{
		/*	for(int i=0;i<10_000_001;i++)
			{
				arr[i]=Math.max(i, arr[i/2]+arr[i/3]+arr[i/4]);
			}*/
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext())
			{
				System.out.println(recsoln(sc.nextInt()));
			}

		}
		long arr[]=new long[1_000_0001];
		Map<Integer,Long> hmap=new HashMap<>();
		private long recsoln(int n)
		{
			if(n==0)
				return 0;
			if(hmap.containsKey(n)&&hmap.get(n)!=0)
				return hmap.get(n);
			long res=Math.max(n,recsoln(n/2)+recsoln(n/3)+recsoln(n/4));
			hmap.put(n, res);
			return res;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new bytelandgoldcoin().run();
	}

}
