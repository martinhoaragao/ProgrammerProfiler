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
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());
            int node = 0;
            for(int i=0;i<n;i++)
            {
                String[] x = br.readLine().split(" ");
                node = node + Integer.parseInt(x[0]) - Integer.parseInt(x[1]);
            }
            sb.append(node).append("\n");
        }
        System.out.println(sb);
	}
}




