
import java.io.*;
import java.util.*;
class treeRoot {

	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int t = input.nextInt();
		String result = "";
		while( t > 0 )
		{
			int n = input.nextInt();
			HashMap< Integer, Integer > map = new HashMap<>();
			int sum = 0;
			int nodeSum = 0;
			for( int i = 0; i < n; i++ )
			{
				nodeSum += input.nextInt();
				sum += input.nextInt();
			}
			
			result += ( nodeSum - sum ) + " ";
			
			result += '\n';
			t--;
		}
		System.out.print( result );
	}
}
