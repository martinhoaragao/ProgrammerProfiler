/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] tile=new int[2][n];
		for(int i=0;i<2;i++){
		String s[]=br.readLine().split(" ");
		for(int j=0;j<n;j++){
		tile[i][j]=Integer.parseInt(s[j]);
		}
		}
		
		System.out.print(maxSum(tile,n));
		}
		catch(Exception e){
		System.out.print(e);
		}
		
	}
	static int maxSum(int[][] tile,int n){
		int[] sum=new int[n+1];
		int d1,d2,s1,s2,j;
		d1=tile[0][0]-tile[1][0];
		if(d1<0)
		d1*=-1;
		sum[1]=d1;
		for(j=1;j<n;j++){
			d1=tile[0][j]-tile[0][j-1];
			if(d1<0)
			d1*=-1;
			d2=tile[1][j]-tile[1][j-1];
			if(d2<0)
			d2*=-1;
			s1=d1+d2+sum[j-1];
			d1=tile[0][j]-tile[1][j];
			if(d1<0)
			d1*=-1;
			s2=d1+sum[j];
			sum[j+1]=s1>s2?s1:s2;
		}
		return sum[n];
	}
} 