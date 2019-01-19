import java.util.*;
class Tree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt() , root = 0;
			while(n-- > 0) {
				int v = sc.nextInt();
				int c = sc.nextInt();
				root = root + (v-c);
			}
			System.out.println(root);
		}
	}
}