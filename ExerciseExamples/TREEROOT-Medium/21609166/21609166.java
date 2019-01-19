import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TREEROOT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		while(testcase-->0) {
			int nodecount = Integer.parseInt(br.readLine());
			int sum = 0;
			while(nodecount-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int nodeid = Integer.parseInt(st.nextToken());
				int childsum = Integer.parseInt(st.nextToken());
				sum += (nodeid - childsum);
				
			}
			System.out.println(sum);
		}

	}

}
