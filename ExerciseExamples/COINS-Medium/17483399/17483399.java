import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    static HashMap<Long, Long> result = new HashMap<>();

    static Long  getValue(long n) {
        if(result.containsKey(n)){
            return result.get(n);
        }
        if(n==0){
            return 0l;
        }
        if(n==1) return 1l;
        if(n == 2) return 2l;
        if(n==3) return 3l;

        result.put(n, Math.max(n, getValue(n/2) + getValue(n/3) + getValue(n/4)));
        return result.get(n);
    }
    public static void main (String[] args){
        FastReader s = new FastReader();
        try {
        String line = s.nextLine();
        while(!line.equalsIgnoreCase("")){
            long a = Long.parseLong(line);
            System.out.println(getValue(a));
            line = s.nextLine();
        }
        } catch (Exception e){
            return;
        }

    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
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
