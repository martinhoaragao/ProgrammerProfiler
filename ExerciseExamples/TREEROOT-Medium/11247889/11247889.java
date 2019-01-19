
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
			int[] node = new int[ n ];
			for( int i = 0; i < n; i++ )
			{
				node[ i ] = input.nextInt();
				nodeSum += node[ i ];
				sum += input.nextInt();
			}
			
			Arrays.sort( node );
			
			for( int i = 0; i < n; i++ )
			{
				if( nodeSum - node[ i ] == sum )
					result += node[ i ] + " ";
			}
			
			result += '\n';
			t--;
		}
		System.out.print( result );
	}
}
