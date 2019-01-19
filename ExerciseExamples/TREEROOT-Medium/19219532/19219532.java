import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
 
class mitt  {
	static boolean DEBUG_FLAG = false;
    int INF = (int)1e9;
    long MOD = 1000000007;
    long p = 101;
    static void debug(String s) {
        if(DEBUG_FLAG) {
            System.out.print(s);
        }
    }
    void simpleSieve(int limit,ArrayList<Integer> arr){
    	boolean mark[] = new boolean[limit+1];
    	for (int i = 0; i < mark.length; i++)
            mark[i] = true;
    	for(int p = 2;p*p<limit;p++){
    		if(mark[p] == true){
    			for (int i=p*2; i<limit; i+=p)
                    mark[i] = false;
    		}
    	}
    	 for (int p=2; p<limit; p++){
             if (mark[p] == true){
            	 arr.add(p);
             }
         }
    	
    }
    
   
    void solve(InputReader in, PrintWriter out) throws IOException {
    	int n = in.nextInt();
    	long sum = 0;
    	for(int i = 0;i<n;i++){
    		sum = sum + in.nextLong() - in.nextLong();
    	}
    	System.out.println(sum);
    	
    }
    
    public static void main(String[] args) throws IOException {
        if(args.length>0 && args[0].equalsIgnoreCase("d")) {
            DEBUG_FLAG = true;
        }
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        long start = System.nanoTime();
        while(t-- >0) {
            new mitt().solve(in, out);
        }
        long end = System.nanoTime();
        debug("\nTime: " + (end-start)/1e6 + " \n\n");
        out.close();
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
    
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
} 