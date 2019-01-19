import java.io.*;
import java.lang.*;
import java.util.*;
class Jonny_uncle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t;
		//System.out.println("Enter the no of test cases ");
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n;
		//	System.out.println("Enter the size of the array ");
			n=sc.nextInt();
			int array[]=new int[n];
			for(int j=0;j<n;j++)
			{
		//		System.out.println("Enter the elements into array ");
				array[j]=sc.nextInt();
			}
			int k;
		//	System.out.println("Enter the position of k ");
			k=sc.nextInt();
			k=k-1;
			 int index=0;
			for(int j=0;j<n;j++)
			{
				if(j==k)
				{
				   index=array[j];	
				}
			}
			Arrays.sort(array);
			for(int j=0;j<n;j++)
			{
				if(array[j]==index)
				{
					System.out.println((j+1));
					break;
				}
			}
		}
		

	}

}
