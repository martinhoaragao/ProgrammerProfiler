import java.util.Arrays;
import java.util.Scanner;
class ques1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();int n,m;
		for (int i = 0; i <t; i++)
		{
			n=sc.nextInt();
			int ar[]=new int[n];
			for (int j = 0; j < ar.length; j++) 
			{
				ar[j]=sc.nextInt();
			}
           int k=sc.nextInt();
           k=ar[k-1];Arrays.sort(ar);
           for (int j = 0; j < ar.length; j++)
           {
			if(ar[j]==k)
			{
				System.out.println(j+1);break;
			}
		}
		}
	}
}
