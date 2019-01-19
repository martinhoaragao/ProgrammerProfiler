import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		while(true)
		{
			int n=Integer.parseInt(bf.readLine().trim());
			if(n==42)break;
			System.out.println(n);
		}
	}
}
