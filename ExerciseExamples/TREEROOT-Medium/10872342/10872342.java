import java.util.*;
//import java.util.Scanner;
class code {
	

	public static void main (String[] args) throws Exception 
	{

	Scanner sc=new Scanner(System.in);
	
	int t=sc.nextInt();
	while(t-->0)
	{
	int n=sc.nextInt();
	
	//int[] a=new int[n];
	//ArrayList<Integer> list=new ArrayList<Integer>();
	
	int sum=0;
	for(int i=0;i<n;i++)
		sum=sum+sc.nextInt()-sc.nextInt();
	
	System.out.println(sum);
}
}
}