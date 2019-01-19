
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author akashvermaofskt
 */
class HOELES {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;
    
    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    
    static int nextInt() {
        return Integer.parseInt(next());
    }
    
    public static void main(String args[]) {
        try {
            int T=nextInt();
            int A[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
            
            while(T-->0){
                String s=next();
                long ans=0;
                for (int i = 0; i < s.length(); i++) {
                    ans+=A[s.charAt(i)-65];
                }
                
                bw.write(ans+"\n");
                
            }
            
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
