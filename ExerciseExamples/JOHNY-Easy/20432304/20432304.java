import java.util.Scanner;
import java.util.Arrays;
class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t!=0){
			t--;
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				
			}
			int k = sc.nextInt()-1;
			int re = a[k];
			Arrays.sort(a);
			int p = Arrays.binarySearch(a, re);
			System.out.println(p+1);
			
		}
	}
}
