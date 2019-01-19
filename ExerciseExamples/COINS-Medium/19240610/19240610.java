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
		long arr[]=new long[10_000_0001];
		private long recsoln(int n)
		{
			
			if(n<arr.length) {
				if(n<11)
					return n;
				if(arr[n]!=0)
					return arr[n];
				else
					return arr[n]=Math.max(n, recsoln(n/2)+recsoln(n/3)+recsoln(n/4));
			}
			
			
				return Math.max(n, recsoln(n/2)+recsoln(n/3)+recsoln(n/4));
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new bytelandgoldcoin().run();
	}

}
