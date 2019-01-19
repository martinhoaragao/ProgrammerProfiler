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
	    int a[]=new int[t];
	    String c[]=new String[t];
	    for (i=0;i<t;i++) {
    		c[i]=s.next();
    		a[i]=0;
    		j=0;
    		for(j=0;j<c[i].length();j++) {
    			if(c[i].charAt(j)=='B') {
    				a[i]=a[i]+2;
    			}
    			else if(c[i].charAt(j)=='A' || c[i].charAt(j)=='D' || c[i].charAt(j)=='O' || c[i].charAt(j)=='P' || c[i].charAt(j)=='Q' || c[i].charAt(j)=='R') {
    				a[i]++;
    			}
    		}
    	}
    	for (i=0;i<t;i++) {
    	    System.out.println(a[i]);
    	}
	}
}