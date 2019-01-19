import java.util.Scanner;

class RootoftheProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++){
			int n = s.nextInt();
			int id,sum;
			int root=0;
			for(int j=0; j<n; j++){
				id = s.nextInt();
				sum = s.nextInt();
				root = root + id-sum;
			}
			System.out.println(root);
		}

	}

}
