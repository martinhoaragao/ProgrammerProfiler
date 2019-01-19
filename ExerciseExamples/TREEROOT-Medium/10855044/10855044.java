import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TREEROOT {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		
		for ( int t = 0; t < T; t++ ) {
			int N = Integer.parseInt(br.readLine().trim());
			int root = 0;
			for ( int n = 0; n < N; n++ ) {
				String[] arr = br.readLine().trim().split(" ");
				int id = Integer.parseInt(arr[0]);
				int child_sum = Integer.parseInt(arr[1]);
				
				root += id - child_sum;
			}
			System.out.println(root);
		}
	}
}