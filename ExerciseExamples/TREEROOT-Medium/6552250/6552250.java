import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int id,sum,root = 0;
		int T = in.nextInt();
		while(T > 0){
			root = 0;
			int N;
			N = in.nextInt();
			while(N > 0){
				id = in.nextInt();
				sum = in.nextInt();
				root += id-sum;
				N--;
			}
			System.out.println(root);
			T--;
		}
        
	}
}