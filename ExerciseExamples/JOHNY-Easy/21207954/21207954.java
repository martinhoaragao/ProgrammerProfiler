

import java.util.Arrays;
import java.util.Scanner;

 class Opera
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int t= s.nextInt();
	while(t>0)
	{
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		int p=a[k-1];
		for(int i=0;i<n;i++)
		{
			
		  Arrays.sort(a);
		  if(a[i]==p)
			  System.out.println(i+1);
		}
		t--;
	}
	s.close();
}
}
