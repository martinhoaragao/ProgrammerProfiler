import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// TREEROOT
	public static void main(String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 4);
		int testCases = Integer.parseInt(reader.readLine());
		final StringBuilder result = new StringBuilder();
		
		while (testCases > 0) {
			int numberOfNodes = Integer.parseInt(reader.readLine());
			int rootNodeId = 0;
			
			while (numberOfNodes > 0) {
				String[] in = reader.readLine().split(" ");
				rootNodeId += Integer.parseInt(in[0]) - Integer.parseInt(in[1]);
				
				numberOfNodes--;
			}
			
			result.append(rootNodeId).append("\n");
			
			testCases--;
		}

		System.out.print(result);
	}

}
