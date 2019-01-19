import java.io.*;
class Input
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		while(true)
		{
			int n=Integer.parseInt(obj.readLine().trim());
			if(n==42)break;
			out.println(n);
		}
	}
}