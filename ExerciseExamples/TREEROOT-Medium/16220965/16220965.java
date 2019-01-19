import java.util.*;
import java.io.*;
 class TreeRoot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FastReader hk=new FastReader();
		int t=hk.nextInt();
		while(t--!=0)
		{
			long id=0,sum=0;
			int n=hk.nextInt();
			while(n--!=0)
			{
				int i=hk.nextInt();
				int s=hk.nextInt();
				id+=i;
				sum+=s;
			}
			System.out.println(id-sum);	
		}
	}

	public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		 
		public FastReader()
		{
		    br = new BufferedReader(new
		             InputStreamReader(System.in));
		}
		 
		String next()
		{
		    while (st == null || !st.hasMoreElements())
		    {
		        try
		        {
		            st = new StringTokenizer(br.readLine());
		        }
		        catch (IOException  e)
		        {
		            e.printStackTrace();
		        }
		    }
		    return st.nextToken();
		}
		 
		int nextInt()
		{
		    return Integer.parseInt(next());
		}
		 
		long nextLong()
		{
		    return Long.parseLong(next());
		}
		 
		double nextDouble()
		{
		    return Double.parseDouble(next());
		}
		 
		String nextLine()
		{
		    String str = "";
		    try
		    {
		        str = br.readLine();
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		    return str;
		}
		}

}
