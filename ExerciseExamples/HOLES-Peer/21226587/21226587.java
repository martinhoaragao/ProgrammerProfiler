    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
    import java.io.PrintWriter;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.HashMap;
    import java.util.TreeMap;
    import java.util.Map;
    import java.util.Arrays;
    import java.util.Set;
    import java.util.HashSet;

    /*
     *
     *  @author Riddle
     *
     */

    class KnightChess
    {
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

        public static void main(String args[])
        {
            FastReader reader = new FastReader();
            PrintWriter out = new PrintWriter(System.out);
            int test = reader.nextInt();
            for(int t =0;t<test;t++)
            {
               char ch[] = reader.next().toCharArray();
               int cnt = 0;
               for(char c : ch)
               {
                switch(c)
                {
                    case 'A': cnt++; break;
                    case 'B': cnt=cnt + 2; break;
                    case 'D': cnt++; break;
                    case 'O': cnt++; break;
                    case 'P': cnt++; break;
                    case 'Q': cnt++; break;
                    case 'R': cnt++; break;

                }
               }
               out.println(cnt);
            }
            out.flush();        
            out.close();
        }
    }