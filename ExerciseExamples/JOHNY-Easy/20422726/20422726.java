
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		int[] s=new int[n];
		
		for(int i=0;i<n;i++)
		s[i]=sc.nextInt();
		
		int k=sc.nextInt();
		int lk=s[k-1];
		
		Arrays.sort(s);
		
		int start=0;int end=n-1;int mid=0;int pos=-1;
		while(start<=end){
		    mid=(start+end)/2;
		    if(s[mid]==lk){pos=mid;break;}
		    else if(lk>=s[mid]){start=mid+1;}
		    else end=mid-1;
		}
		
		System.out.println(pos+1);
		
		    
		}
		
		
		
	}
}
