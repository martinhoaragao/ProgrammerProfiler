import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class DoubleStrings
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);		
		int T = Integer.parseInt(br.readLine());		
		while(T-- > 0)
		{
			int N = Integer.parseInt(br.readLine());
			int max = 0;
			if(N % 2 == 0)
				max = N;
			else
				max = N - 1;
				
			pw.write(max + "\n");
		}
		pw.flush();
	}
}