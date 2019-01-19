
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 * Comments Here
 * 
 */
class TREEROOT
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		in.nextLine();
		for(int i = 0; i < tests; ++i) {
			int nodes = in.nextInt();
			in.nextLine();
			int child = 0;
			int ind = 0;
			for(int j = 0; j < nodes; ++j) {
				ind += in.nextInt();
				child += in.nextInt();
				in.nextLine();
			}
			System.out.println(ind-child);
		}
		

		in.close();
		
	}
	

	
	
}

