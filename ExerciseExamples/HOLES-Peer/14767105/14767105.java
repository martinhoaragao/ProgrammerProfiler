import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;

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
		String string;

		totalTests = Integer.valueOf( bufferedReader.readLine() );

		while( currentTest <= totalTests )
		{
			string = bufferedReader.readLine();
			processTheRequest(string);

			currentTest = currentTest + 1;
		}
	}

	private static void processTheRequest(String string) throws IOException
	{
		// A, B, D, O, P, Q, R
		int currentIndex = 0;
		int currentCount = 0;
		String outputStr;

		while( currentIndex < string.length() )
		{
			currentCount = currentCount + getCount( string.charAt(currentIndex) );
			currentIndex = currentIndex + 1;
		}

		outputStr = String.valueOf(currentCount) + "\n";
		bufferedOutputStream.write( outputStr.getBytes() );
	}

	private static int getCount(char letter)
	{
		switch(letter)
		{
			case 'A':
				return 1;
			case 'B':
				return 2;
			case 'D':
				return 1;
			case 'O':
				return 1;
			case 'P':
				return 1;
			case 'Q':
				return 1;
			case 'R':
				return 1;
			default:
				return 0;
		}
	}






















}