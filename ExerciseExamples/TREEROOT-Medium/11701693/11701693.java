import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-- > 0) {
			int nodes = Integer.parseInt(br.readLine());
			int sumNodes = 0;
			int sumBranches = 0;
			while(nodes-- > 0) {
				String arg[] = br.readLine().split(" ");
				sumNodes += Integer.parseInt(arg[0]);
				sumBranches += Integer.parseInt(arg[1]);
			}
			System.out.println(sumNodes-sumBranches);
		}
	}

}
