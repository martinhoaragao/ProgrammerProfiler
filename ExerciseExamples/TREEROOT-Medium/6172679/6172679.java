import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
 
 
 class Root_of_the_Problem {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N = Integer.parseInt(br.readLine());
			int [] a1=new int[N];
			int [] a2=new int[N];
			for(int i=0;i<N;i++)
			{
				String[] ss = br.readLine().split(" ");
				a1[i]=Integer.parseInt(ss[0]);
				a2[i]=Integer.parseInt(ss[1]);
			}
			int sum1 = IntStream.of(a1).sum();
			int sum2 = IntStream.of(a2).sum();
			pw.println(sum1-sum2);
		}
		
		
		
		pw.close();
	}

}
