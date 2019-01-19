import java.io.*;
class Double
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++)
		{
			long length = Integer.parseInt(br.readLine());
			if(length % 2 == 0)
				System.out.println(length);
			else
				System.out.println(length - 1);
		}
	}
}