import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int N=scan.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=scan.nextInt();
            }
            int K=scan.nextInt();
            int x=arr[K-1];
            int p=1;
            for(int i=0;i<N;i++){
				if(arr[i]<x)
					p++;
        }System.out.println(p);
    }
}
}