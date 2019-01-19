import java.util.*;
class main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ;i++){
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int u = a[k-1];
			Arrays.sort(a);
			int c = Arrays.binarySearch(a,u);
			System.out.println(c+1);
		}
	}
}