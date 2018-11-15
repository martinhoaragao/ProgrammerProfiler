import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		while (T-- > 0) {
			int N = scn.nextInt();
			int[] A = new int[N];
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				A[i] = scn.nextInt();
				al.add(i + 1);
			}
			int[] order = new int[N];
			for(int i = N-1;i>=0;i--){
				order[i] = al.remove(al.size()-1-A[i]);
			}
			
			for(int i = 0;i<N;i++){
				System.out.print(order[i]+" ");
			}
			System.out.println();
		}
	}
}
