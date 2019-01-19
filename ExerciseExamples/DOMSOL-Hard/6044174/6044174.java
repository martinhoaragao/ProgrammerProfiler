import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class PairOfTiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		StringTokenizer st;
		int n=Integer.parseInt(r.readLine());
		int [] a=new int[n+1];
		int [] b=new int[n+1];
		int [] dp1=new int[n+1];
		int [] dp2=new int[n+1];
		st=new StringTokenizer(r.readLine());
		for(int i=1;i<=n;i++){
			a[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(r.readLine());
		for(int i=1;i<=n;i++){
			b[i]=Integer.parseInt(st.nextToken());
		}
		dp1[0]=0;
		dp2[0]=0;
		dp1[1]=Math.abs(a[1]-b[1]);
		dp2[1]=dp1[1];
		for(int i=2;i<=n;i++){
			dp1[i]=Math.max(dp1[i-1], dp2[i-1])+Math.abs(a[i]-b[i]);
			dp2[i]=Math.max(dp1[i-2], dp2[i-2])+Math.abs(a[i]-a[i-1])+Math.abs(b[i]-b[i-1]);
		}
		out.println(Math.max(dp1[n], dp2[n]));
		out.flush();
		out.close();
		r.close();
	}

}
