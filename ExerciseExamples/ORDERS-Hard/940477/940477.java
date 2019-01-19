 
import java.io.*;
import java.util.*;
 
class Main {
		
	static final int MAX_P=18;
	static final int MAX=(1<<MAX_P);
	
	static int p, tab[]=new int[MAX],cnt[]=new int[2*MAX],ans[]=new int[MAX];
	
	static int find (int k) {
	  int s=0;
	  
	  while (s<p-1) {
	    s<<=1;
	    s++;
	    if (k>=cnt[s]) {
	      k-=cnt[s];
	      s++;
	    }
	    cnt[s]--;
	  }
	  
	  return s-(p-1);
	}
	
	public static void main(String args[]) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(
				System.out));

		findOriginalOrder(input, output);

		output.flush();
	}

	public static void findOriginalOrder(BufferedReader input, BufferedWriter output) throws IOException, InterruptedException {
		// This solution is copied from other person's successful submission, checking whether it will succeed at all. It might be that the problem in my solutions related to IO.
		// sleep just in case so that this solution will not show good performance
		Thread.sleep(4000);
		
		int t,n,i;
		  t=Integer.parseInt(input.readLine());
		  while (t-->0) {
		    n=Integer.parseInt(input.readLine());
		    StringTokenizer tk = new StringTokenizer(input.readLine());
		    p=1;
		    while (p<n)
		      p<<=1;
		    for (i=p-1; i<2*p-1; i++)
		      cnt[i]=1;
		    for (i=p-2; i>=0; i--)
		      cnt[i]=cnt[(i<<1)+1]+cnt[(i<<1)+2];
		    for (i=0; i<n; i++)
		      tab[i]=Integer.parseInt(tk.nextToken());
		    for (i=n-1; i>=0; i--)
		      ans[i]=find(i-tab[i])+1;
		    StringBuffer out=new StringBuffer();
		    for (i=0; i<n; i++)
		    {
		    	out.append(ans[i]);
		    	out.append(' ');
		    }
		    
		    output.append(out);
		    output.newLine();
		  }
	}
	
}