
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author its_PKY
 */
 class TREEROOT {

    /**
     * @param args the command line arguments
     */
     
    static class FastScanner{
        BufferedReader s;
        StringTokenizer st;
        
        public FastScanner(){
            st = new StringTokenizer("");
            s = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public FastScanner(File f) throws FileNotFoundException{
            st = new StringTokenizer("");
            s = new BufferedReader (new FileReader(f));
        }
        
        public int nextInt() throws IOException{
            if(st.hasMoreTokens())
                return Integer.parseInt(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextInt();
            }
        }
        
      public double nextDouble() throws IOException{
            if(st.hasMoreTokens())
                return Double.parseDouble(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextDouble();
            }
        }
      
        public long nextLong() throws IOException{
            if(st.hasMoreTokens())
                return Long.parseLong(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextLong();
            }
        }
        
        public String nextString() throws IOException{
            if(st.hasMoreTokens())
                return st.nextToken();
            else{
                st = new StringTokenizer(s.readLine());
                return nextString();
            }
            
        }
        public String readLine() throws IOException{
            return s.readLine();
        }
        
        public void close() throws IOException{
            s.close();
        }
        
    }
      private static FastScanner s = new FastScanner();   
      private static PrintWriter ww = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(s.nextString());
        while(t--!=0)
        {
            int n=Integer.parseInt(s.nextString());
            int ans=0;
            while(n--!=0)
            {
                int p=Integer.parseInt(s.nextString());
                int q=Integer.parseInt(s.nextString());
                ans+=p-q;
                
            }        
            ww.println(ans);
        }
        ww.flush();
        // TODO code application logic here
    }
    
}