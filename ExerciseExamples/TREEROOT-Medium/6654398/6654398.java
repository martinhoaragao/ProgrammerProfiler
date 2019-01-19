import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

class TREEROOT
{	
	// http://www.codechef.com/problems/TREEROOT
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++){
			
			int[] node = new int[35];
			int[] val = new int[35];
			
			int N = Integer.parseInt(br.readLine());	
			String[] input;
			for(int i = 0; i < N; i++){
				input = br.readLine().split(" ");
				node[i] = Integer.parseInt(input[0]);
				val[i] = Integer.parseInt(input[1]);
			}
			
			int ans=0;
			for(int i = 0; i < N; i++){
				ans -= val[i];
				ans += node[i];
			}
			pw.println(ans);
		}				 
        pw.close();
	}
}
