import java.io.*;
import java.util.*;
class Test 
{ 
	public static void main(String args[]) throws IOException 
		{
		long res=0;
			Scanner sc=new Scanner(System.in);
		    int T=sc.nextInt();  //Enter total number of testcases
			for(int i=0;i<T;i++) 
			{   
				int sum_id=0,sum_value=0;
				int n=sc.nextInt();
				for(int c=0;c<n;c++)
				{
					int x=sc.nextInt();
					int y=sc.nextInt();
					sum_id+=x;
					sum_value+=y;
				}
				System.out.println(sum_id-sum_value);
			} // End of for loop 
				
		}
	
}


 