import java.util.Scanner;
import java.util.*;

class UncleJohny{
	public static void main (String[] args)
	{
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    for(int i = 0; i<T; i++)
	    {
	        int N = scan.nextInt();
	        ArrayList<Integer> unsorted = new ArrayList<Integer>();
	        for(int j = 0; j<N;j++)
	        {
	            unsorted.add(j,scan.nextInt());
	        }
	        int K = scan.nextInt();
	        int song = unsorted.get(K-1);
	        Collections.sort(unsorted);
	        System.out.println(unsorted.indexOf(song)+1);
	        
	    }
	}
}