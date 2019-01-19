import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    DataInputStream K=new DataInputStream(System.in);
		int t=Integer.parseInt(K.readLine());
		for(int i=0;i<t;i++)
		{
		    int n=Integer.parseInt(K.readLine());
		    int no[]=new int[n];
		    String st[]=(K.readLine()+" ").split(" ");
		    for(int j=0;j<n;j++)
		        no[j]=Integer.parseInt(st[j]);
		    int tag=no[Integer.parseInt(K.readLine())-1];
		    Arrays.sort(no);
		    int index=Arrays.binarySearch(no,tag);
		    System.out.println(index+1);
		}
	}
}
