import  java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class hacker
{
    /*FAtt gyi bbhai*/
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

    static void max(long[] arr,long n)
    {
       
    }


    public static void main(String[] args)
    {
        new hacker().run();
    }
    void run()
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long N = sc.nextLong();
            if(N%2==0)
            {
                System.out.println(N);
            }
            else
            {
                System.out.println(N-1);
            }
        }

       


    }
  
   
    


   


    
}

   
