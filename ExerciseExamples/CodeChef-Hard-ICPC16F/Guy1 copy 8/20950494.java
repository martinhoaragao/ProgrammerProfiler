import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class mat
{
	//Credits to geeksforgeeks for fast scanning
		static class FastReader
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
    public static void main(String[] args)throws Exception
    {
    	FastReader s=new FastReader();
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int m=s.nextInt();
            int d=s.nextInt();
            int D=s.nextInt();
            if(D*n<m || d*n>m)
            {
                System.out.println("-1");
                continue;
            }
            int mind=m/n,j=0;
            for(int i=1;i<=n;i++)
            {
                for(j=i;j<i+mind;j++){
                    int temp=j;
                if(temp>n)
                   temp-=n;
                    System.out.println(i+" "+temp);
                }
            }
                int extra=m-n*mind;
                for(int i=1;i<=extra;i++){
                    int temp=i+mind;
                    if(temp>n)
                        temp=temp-n;
                    System.out.println(i+" "+temp);
                }
            
        }
    }
}