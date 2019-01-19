import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;

public class Main
{
	private static BufferedReader bufferedReader;
	private static BufferedOutputStream bufferedOutputStream;

	public static void main(String[] args) throws IOException
	{
		bufferedReader = new BufferedReader( new InputStreamReader(System.in) );
		bufferedOutputStream = new BufferedOutputStream( System.out );

		takeUserInput();

		bufferedReader.close();
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}	

	private static void takeUserInput() throws IOException
	{
		int totalTests;
		int currentTest = 1;
		int num;

		totalTests = Integer.valueOf( bufferedReader.readLine() );

		while( currentTest <= totalTests )
		{
			num = Integer.valueOf( bufferedReader.readLine() );

			if( num % 2 == 0 )
			{
				bufferedOutputStream.write( (String.valueOf(num) + "\n").getBytes() );
			}

			else
			{
				bufferedOutputStream.write( (String.valueOf(num-1) + "\n").getBytes() );
			}

			currentTest = currentTest + 1;
		}
	}
}