import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String x = br.readLine();
		
		int t = Integer.parseInt(x);
		while(t-->0)
		{
			Long n = Long.parseLong(br.readLine());
			
			if( (n&1) == 1 )
				System.out.println(n-1);
			else
				System.out.println(n);
		}
	}
}