import java.util.Scanner;

class ORDERS{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x;
		while(t-- > 0){
			int n = sc.nextInt();
			int[] sol = new int[n];//soldiers input
			int[] rank = new int[n];
			for(int i = 0; i < n; i++){
				sol[i] = sc.nextInt();
				rank[i] = i+1;
			}
			for(int i = n-1; i >= 0; i--){
				int p = i - sol[i];//p points to current position after moving sol[i] places
				int temp = rank[p];
				for(; p < i; p++){
					rank[p] = rank[p+1];//shifting 1 rank ahead
				}
				rank[p] = temp;
			}
			for(int i : rank){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}