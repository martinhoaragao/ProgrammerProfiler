import java.util.Scanner;

class Main
{
	public static int[] rank;
	public static int[] moves;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int i,j,n;
		String pos = "",throwaway = "";
		
		for(i=0; i<T; i++)
		{
			n = sc.nextInt();
			throwaway = sc.nextLine();
			pos = sc.nextLine();
			
			prepareArrays(n,pos);
			allotRank(n);
			
			for(j=0; j<n; j++)
			{
				System.out.print(rank[j]+" ");
			}
			System.out.println();
		}
	}
	
	private static void prepareArrays(int n, String pos)
	{
		int i;
		
		rank = new int[n];
		moves = new int[n];
		
		String s[] = pos.split(" ");
		
		for(i=0; i<n; i++)
		{
			rank[i] = i+1;
			moves[i] = Integer.parseInt(s[i]);
		}
	}
	
	private static void allotRank(int n)
	{
		int i,j,k,temp;
		
		for(i=n-1; i>=0; i--)
		{
			k = i - moves[i];
			
			temp = rank[k];
			
			for(j=k; j<i; j++)
			{
				rank[j] = rank[j+1];
			}
			
			rank[j] = temp;
		}
	}
}