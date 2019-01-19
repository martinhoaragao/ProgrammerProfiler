// /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,temp,t,pos;
		int[] a,m;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			a=new int[n];
			m=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				m[i]=i+1;
			}
			for(int i=n-1;i>0;i--)
			{
				if(a[i]>0)
				{
					pos=i-a[i];
					temp=m[pos];
					for(int j=a[i];j>0;j--)
					{
						m[pos]=m[pos+1];
						pos++;
					}
					m[i]=temp;
				}
			}
			for(int x=0;x<n;x++)
			{
				System.out.println(m[x]);
			}
		t--;
		}

	}
}
// import java.util.Scanner;

// class Codechef {
//     public static void main(String args[])throws java.lang.Exception {
//         Scanner s=new Scanner(System.in);
//         int t=s.nextInt();
//         for(int i=0;i<t;i++)
//         {
//             int n=s.nextInt();
//             int[] arr=new int[n];
//             int[] arr2=new int[n];
//             int[] ans=new int[n];
//             for(int j=0;j<n;j++)
//             {
//                 arr[j]=s.nextInt();
//                 arr2[j]=j+1;
//             }
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[j]>0) {
//                     int c = arr[j];
//                     int temp = arr2[j];
//                     for (int k = 0; k < c; k++) {
                        
//                         arr2[j] = arr2[j - 1];
                        
//                         j--;
//                     }
//                     arr2[j] = temp;
//                     j += c;
//                 }
//             }
//             for(int j=0;j<n;j++)

//             {
//                 int k=0;
//                 while(arr2[k]!=(j+1))
//                 {
//                     k++;
//                 }
//                 ans[j]=k+1;
//                 System.out.print(ans[j]+" ");
//             }
//             System.out.println();
//         }


//     }
// }
