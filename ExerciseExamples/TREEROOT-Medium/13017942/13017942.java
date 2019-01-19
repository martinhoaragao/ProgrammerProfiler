import java.util.Scanner;
class TreeRoot {
	public static void main(String[] args) {
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int root = 0;
			for(int j=0;j<n;j++) {
				int x = s.nextInt();
				int y = s.nextInt();
				root += (x-y);
			}
			System.out.println(root);
		}
	}
}
