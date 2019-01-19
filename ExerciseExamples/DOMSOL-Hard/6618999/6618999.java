import java.util.*;
import java.io.*;


public class Main implements Runnable {
		
	public void solve() throws IOException {
                int N = nextInt();
                int[][] a = new int[N][2];
                for(int i = 0; i < 2; i++){
                        for(int j = 0; j < N; j++){
                                a[j][i] = nextInt();
                        }
                }
                
                int[] dp = new int[N+1];
                for(int i = 0; i < N; i++){
                        //try vertical
                        dp[i+1] = Math.max(dp[i+1], dp[i] + Math.abs(a[i][0] - a[i][1]));
                        //try horizontal
                        if(i+2 <= N) dp[i+2] = Math.max(dp[i+2],
                                dp[i] + Math.abs(a[i][0] - a[i+1][0]) + Math.abs(a[i][1] - a[i+1][1]));
                }
                
                //System.out.println(Arrays.toString(dp));
                out.println(dp[N]);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-----------------------------------------------------------
	public static void main(String[] args) {
		new Main().run();
	}

        public void debug(Object... arr){
            System.out.println(Arrays.deepToString(arr));
        }

        public void print1Int(int[] a){
                for(int i = 0; i < a.length; i++)
                        System.out.print(a[i] + " ");
                System.out.println();
        }
        
        public void print2Int(int[][] a){
                for(int i = 0; i < a.length; i++){
                        for(int j = 0; j < a[0].length; j++){
                                System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                }
        }
        
	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
                        out = new PrintWriter(System.out);
			tok = null;
			solve();
			in.close();
                        out.close();
		} catch (IOException e) {
			System.exit(0);
		}
	}

	public String nextToken() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
        PrintWriter out;
	BufferedReader in;
	StringTokenizer tok;
}