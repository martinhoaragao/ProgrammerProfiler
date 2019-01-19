import java.io.*;
import java.util.*;
class Lo 
{
   
  
   
    public static void main(String args[] ) throws Exception 
    {
        
        FastReader in = new FastReader();
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            int m = in.nextInt();
            int[] a = new int[m+1];
            for(int j=1;j<=m;j++)
            {
                a[j] = in.nextInt();
            }
            int search = in.nextInt();
            int p = a[search];
            Arrays.sort(a);
            for(int j=1;j<=m;j++)
            {
                if(a[j]==p)
                {
                    System.out.println(j);
                    break;
                }
            }
        }

    }
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
}


