import java.util.*;
import java.io.*;

class Treeroot
{
    int testCases, nodeCount, unique_id, child_sum, root = 0;

    public void process()
    {
        FastReader fs = new FastReader();
        testCases = fs.nextInt();
        while(testCases-- > 0)
        {
            nodeCount = fs.nextInt();
            for(int i = 0; i < nodeCount; i++)
            {
                unique_id = fs.nextInt();
                child_sum = fs.nextInt();
                root += unique_id - child_sum;
            }
            System.out.println(root);
            root = 0;
        }
    }

    public static void main(String[] args) throws IOException
    {
        // System.setIn(new FileInputStream("d:\\programming\\case.txt"));
        new Treeroot().process();
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
                catch (IOException e)
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
    }
}