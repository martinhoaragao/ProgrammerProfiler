import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
	public static void main (String[] args) throws java.lang.Exception {
	    FastReader s=new FastReader();
	    int t,i,j;
	    t=s.nextInt();
	    int a[]=new int[t],b[]=new int[t];
	    for (i=0;i<t;i++) {
    		b[i]=s.nextInt();
    		a[i]=0;
    		j=0;
    		if(b[i]%2==0) {
    		    a[i]=b[i];
    		}
    		else {
    		    a[i]=b[i]-1;
    		}
    	}
    	for (i=0;i<t;i++) {
    	    System.out.println(a[i]);
    	}
	}
}