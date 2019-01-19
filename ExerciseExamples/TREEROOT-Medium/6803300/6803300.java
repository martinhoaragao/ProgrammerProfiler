   import java.io.*;
import java.util.*;
class Main{
    static BufferedReader br;
    static PrintWriter out;
    static void solve() throws Exception{
        int t;
		t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			long res=0;
			while(n-->0){
				String[] s=br.readLine().trim().split(" ");
				res+=(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
			}
			out.println(res);
		}
	}
   public static void main(String args[]) throws Exception{
		br=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(System.out);
		solve();
		out.flush();
	}
}