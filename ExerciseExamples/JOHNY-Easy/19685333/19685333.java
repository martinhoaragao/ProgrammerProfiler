import java.util.*;
class UncleJhonny {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=1;j<=t;j++)
		{
		int n=sc.nextInt();
		int ar[]=new int [n];int c=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=ar[k-1];
		for(int i=0;i<n;i++)
		{
			if(ar[i]<k)
				c++;
		}
		System.out.println(++c);
		
	}

}}
