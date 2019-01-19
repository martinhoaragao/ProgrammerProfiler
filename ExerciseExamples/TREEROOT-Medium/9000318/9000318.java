import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TREEROOT {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			int root = 0;
			while(N-- > 0) {
				String[] input = br.readLine().split(" ");
				int node = Integer.parseInt(input[0]);
				int sumOfChildren = Integer.parseInt(input[1]);
				
				root += node - sumOfChildren;
			}
			System.out.println(root);
		}
	}

}
