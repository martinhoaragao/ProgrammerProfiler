import java.io.*;
class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String s = br.readLine();
			int a = Integer.parseInt(s);
			if(a == 42)
			break;
			else
			System.out.println(a);
		}
		br.close();
	}
}