import java.io.*;
class holes
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++)
		{	int sum = 0;
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++)
			{
				char ch = s.charAt(j);
				if(ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R')
				{
					sum += 1;
				}
				else if(ch == 'B')
				{
					sum += 2;
				}
			}
			System.out.println(sum);
		}
	}
}