
import java.io.*;
import java.util.*;
class D {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String[] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int d = Integer.parseInt(str[2]);
			int D = Integer.parseInt(str[3]);
			if(m < n*d || m > n*D || m > n*n)
			{
				out.println(-1);
				continue;
			}
			
			int degree = m/n;
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < degree; j++)
				{
					out.println((i+1) + " " + (((i+j)%n)+1));
				}
			}
			
			int rem = m - n*(degree);
			for(int i = 0; i < rem; i++)
			{
				out.println((i+1) + " " + (((i+degree)%n)+1));
			}
		}
		out.flush();
		out.close();
	}	
}
