import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for (int i = 0; i < t; i++) {
			int n=scn.nextInt();
			int [] a=new int[n];
			for (int j = 0; j < n; j++)
			{
				a[j]=scn.nextInt();
			}
			int k=scn.nextInt();
			test(a,k);
		}

	}

	private static void test(int[] a, int k) {
		int y=a[k-1];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==y)
			{
				System.out.println(i+1); 
				break;
			}
		}
		
	}

}
