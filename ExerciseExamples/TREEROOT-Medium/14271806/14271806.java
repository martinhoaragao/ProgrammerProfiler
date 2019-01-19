import java.lang.*;
import java.io.*;
import java.util.*;
class Root
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
	t--;
	int n,i;
	n=sc.nextInt();
	int a[]=new int[n];
	int s[] = new int[n];
	int root=0;
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	s[i]=sc.nextInt();
	root=a[i]-s[i]+root;
	}
	System.out.println(root);
	
	}	
	}
}