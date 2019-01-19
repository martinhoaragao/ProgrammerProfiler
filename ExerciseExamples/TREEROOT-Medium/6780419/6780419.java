import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(br.readLine().trim());
		for(int thisCase = 0; thisCase < numCases; thisCase++)
		{
			int numNodes = Integer.parseInt(br.readLine().trim());
			int totChildren = 0;
			int totIds = 0;
			for(int i = 0; i < numNodes; i++)
			{
				String[] input = br.readLine().trim().split("\\s+");
				totIds += Integer.parseInt(input[0].trim());
				totChildren += Integer.parseInt(input[1].trim());
			}
			
			System.out.println(totIds - totChildren);
		}
	}
}
