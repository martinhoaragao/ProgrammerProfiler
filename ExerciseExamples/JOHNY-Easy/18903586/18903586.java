/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        while(test--!=0)
        {
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            int x=scan.nextInt();
            x=x-1;
            int arr_x=arr[x];
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]==arr_x){
                    System.out.println(i+1);
                    break;
                }
            }
            
        }
	}
}