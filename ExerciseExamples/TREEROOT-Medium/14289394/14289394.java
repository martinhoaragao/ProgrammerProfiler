    import java.util.Scanner;
    import java.io.*;
     
    class TreeRoot
    {
    	public static void main(String[] args)
    	{
    		Scanner in = new Scanner(System.in);
    		int t = in.nextInt();
    		findRoot(t, in);
    	}
    	
    	public static void findRoot(int t, Scanner in)
    	{
    		for (int i = 0; i < t; i++)
    		{
    			int nid = in.nextInt();
    			int root = 0;
    			for (int j = 0; j < nid; j++)
    			{
    				int node = in.nextInt();
    				int sum = in.nextInt();
    				root += node - sum;
    			}
    			System.out.println(root);
    		}
    	}
    } 