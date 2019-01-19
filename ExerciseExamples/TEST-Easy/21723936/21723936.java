import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			String input = r.readLine();
			
			if (!input.equals("42"))
			{
				System.out.println(input);
			}
			else
			{
				break;
			}
		}
	}
}