import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for (int i=0;i<t;i++){
			
			int n=s.nextInt();
			int a[]=new int [n];
			for (int j=0;j<a.length;j++)
				a[j]=s.nextInt();
			int k=s.nextInt();
			int num=a[k-1];
			int count=0;
			for (int j=0;j<a.length;j++)
				if (a[j]<num)
					count++;
			
			System.out.println(count+1);
}}}