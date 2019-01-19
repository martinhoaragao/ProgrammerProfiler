/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
          String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		int T=sc.nextInt();
		while(T-->0)
		{
		    int m=sc.nextInt();
		   int a[]=new int[m];
		    for(int i=0;i<m;i++)
		    {
		       a[i]=sc.nextInt(); 
		    }
		    int k=sc.nextInt();
		    int s=a[k-1];
            Arrays.sort(a);
            int beg=0,end=m-1;
            int p=(beg+end)/2;
            while(s!=a[p])
            {
                if(s<a[p])
                end=p;
                else
                beg=p+1;
                p=(beg+end)/2;
            }
            System.out.println(p+1);
		}
	}
}
