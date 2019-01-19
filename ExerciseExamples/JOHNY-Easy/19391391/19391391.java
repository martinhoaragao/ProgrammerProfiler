import java.util.Scanner;
import java.util.Arrays;
class Competitive_Code_template{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//Code Here:-
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<a.length;j++)
				a[j]=sc.nextInt();
			int k=sc.nextInt()-1;
			//System.out.println(Arrays.toString(a));
			int z=a[k];
			//System.out.println("Searching for "+z);
			Arrays.sort(a);
			//System.out.println(Arrays.toString(a));
			k=Arrays.binarySearch(a,z);
			k++;
			System.out.println(k);
			k=n=0;
		}
		//---------
	}
}