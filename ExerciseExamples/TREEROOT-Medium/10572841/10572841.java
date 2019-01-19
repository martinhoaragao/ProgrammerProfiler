/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());
        int i=0;
        for(i=0;i<test_cases;i++)
        {
            int n = Integer.parseInt(br.readLine());
            int j=0;
            int root=0;
            for(j=0;j<n;j++)
            {
                String[] input = br.readLine().split(" ");
                int id= Integer.parseInt(input[0]);
                int sums= Integer.parseInt(input[1]);
                
                root = root + id - sums;
            }
            System.out.println(root);
        }
        
	}
}
