import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			int num = Integer.parseInt(br.readLine());
			if(num != 42) System.out.println(num);
			else break;
		}
	}
}