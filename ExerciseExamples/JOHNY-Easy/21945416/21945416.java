import java.util.Arrays;
import java.util.Scanner;
 class UncleJohny {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int p = a[k-1];
			Arrays.sort(a);
			for(int i=0;i<n;i++){
				if(a[i]==p){
					System.out.println(i+1);
				}
			}
			
			
			t--;
		}
	}

}
