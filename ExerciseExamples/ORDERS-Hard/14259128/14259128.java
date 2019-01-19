/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int b[]=new int[n];
            String[] s=br.readLine().split(" ");
            int i,j;
            for(i=0;i<n;i++)
            {
                a[i]=i+1;
                b[i]=Integer.parseInt(s[i]);
            }
            for(i=n-1;i>=0;i--)
            {
                j=i-b[i];
                int temp = a[j];
                for(;j<i;j++)
                {
                    a[j]=a[j+1];
                }
                a[j]=temp;
            }
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print("\n");
        }
	}
}
